var searchBox =document.getElementById('searchDiv')
var searchFire = document.getElementById('search')
var searchContent =document.getElementById('content')
var cases = ['critical','deaths','confirmed','recovered']

var code,result

searchContent.addEventListener('keypress',function(e){
	if (e.key==="Enter") {
		 code=formatCode(searchContent.value)
		 code.then(function(res){
			 promiseResult=sendRequest(res)
			extractDataFromPromise(promiseResult)
		 })
	}
})

searchFire.addEventListener('click',function(){
	
})

function formatCode  (data){
	return fetch("https://restcountries.eu/rest/v2/name/"+data).then(response=>{   
		return response.json().then(function(data) {
			return s=data[0]['cioc']
		})
		})
		
		
}



function sendRequest(code){
	var date = (new Date()).toISOString().split('T')[0];
	url="https://covid-19-data.p.rapidapi.com/country/code?code="+code+"&date="+date
	var data=fetch(url, {
	"method": "GET",
	"headers": {
		"x-rapidapi-key": "083f97a4dbmsh9fc3d302a122034p174edejsnf8db177e509b",
		"x-rapidapi-host": "covid-19-data.p.rapidapi.com"
		}
	})
	.then(response => {
		return response.json().then(function(data) {
			console.log(data[0])
		 	return data[0]
		})
	})
	.catch(err => {
		console.error(err);
	});

	return data
	
}

function extractDataFromPromise(promiseResult){
	const result = async () => {
		const result = await promiseResult;
		console.log(result)
		searchBox.style.display="none"
		cases.forEach(element => {
			var tag = document.createElement("p");
			var text = document.createTextNode(result[element]);
			tag.appendChild(text);
			document.getElementById(element).appendChild(tag)
		});
		document.getElementById('country').innerHTML=result['country']
		document.getElementsByClassName('displayResponse').item(0).style.display="flex"
		
	  };
 	result()
}


