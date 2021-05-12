package tn.JobPortal.RestEasy.Util;
/*

ILR Proficiency Levels

The Interagency Language Roundtable (ILR) scale was developed to measure a person’s ability to communicate in a language.
It consists of five levels of language proficiency and is the standard grading scale for language proficiency for the Federal Government.
For more details : https://www.icls.edu/foreign-language-programs/ilr-proficiency-levels/

*/

public enum LanguageLevel {
    A1(0),A2(1),B1(2),B2(3),C1(4),C2(5);
    private int level;
    private String[] description;
    LanguageLevel(int level) {
        this.level = level;
        this.description = new String[4];
        switch (level)
        {
            case 0:
                this.description[0] = "Memorized proficiency is rated 0+ on the scale. The following describes the traits of an ILR Level 0+ individual:";
                this.description[1] = "able to satisfy immediate needs using rehearsed utterances";
                this.description[2] = "sufficient comprehension to understand memorized utterances in areas of immediate needs";
                this.description[3] = "unable to read connected prose but may be able to read numbers, isolated words and phrases, personal and place names, street signs, office and shop designations";
            break;
            
            case 1:
                this.description[0] = "Elementary proficiency is rated 1 on the scale. The following describes the traits of an ILR Level 1 individual:";
                this.description[1] = "to satisfy minimum courtesy requirements and maintain very simple face-to-face conversations on familiar topics";
                this.description[2] = "sufficient comprehension to understand utterances about basic survival needs and minimum courtesy and travel requirements in areas of immediate need or on very familiar topics, can understand simple questions and answers, simple statements and very simple face-to-face conversations in a standard dialect";
                this.description[3] = "sufficient comprehension to read very simple connected written material in a form equivalent to usual printing or typescript";
            break;

            case 2:
                this.description[0] = "Limited working proficiency is rated 2 on the scale. A person at this level is described as follows:";
                this.description[1] = "able to satisfy routine social demands and limited work requirements";
                this.description[2] = "sufficient comprehension to understand conversations on routine social demands and limited job requirements";
                this.description[3] = "sufficient comprehension to read simple, authentic written material in a form equivalent to usual printing or typescript on subjects within a familiar context";
            break;

            case 3:
                this.description[0] = "Professional working proficiency is rated 3 on the scale. A person at this level is described as follows:";
                this.description[1] = "able to speak the language with sufficient structural accuracy and vocabulary to participate effectively in most conversations on practical, social, and professional topics";
                this.description[2] = "able to understand the essentials of all speech in a standard dialect including technical discussions within a special field";
                this.description[3] = "able to read within a normal range of speed and with almost complete comprehension a variety of authentic prose material on unfamiliar subjects";
            break;

            case 4:
                this.description[0] = "Full professional proficiency is rated 4 on the scale. A person at this level is described as follows:";
                this.description[1] = "able to use the language fluently and accurately on all levels and as normally pertinent to professional needs";
                this.description[2] = "able to understand all forms and styles of speech pertinent to professional needs";
                this.description[3] = "able to read fluently and accurately all styles and forms of the language pertinent to professional needs";
            break;
            case 5:
                this.description[0] = "Native or bilingual proficiency is rated 5 on the scale. A person at this level is described as follows:";
                this.description[1] = "has a speaking proficiency equivalent to that of an educated native speaker";
                this.description[2] = "able to understand fully all forms and styles of speech intelligible to the well-educated native listener, including a number of regional and illiterate dialects, highly colloquial speech and conversations and discourse distorted by marked interference from other noise";
                this.description[3] = "able to read fluently and accurately all styles and forms of the language pertinent to professional needs";
            break;

        }
    } 
        public String [] getDescription()
        {
            return this.description;
        }
        public String getDescription(int index)
        {
            return this.description[index];
        }

    
    
}