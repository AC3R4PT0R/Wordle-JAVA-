char CorrectAnswerArray[] = new char[5];
	char UserAnswerArray[] = new char[5];
	char TestAnswerArrayAlpha[] = new char[5];
	char TestAnswerArrayBeta[] = new char[5];
	char TestAnswerArrayCharley[] = new char[5];
	char FinalTestAnswerArray[] = new char[5];
	String Correctword = "admin";
String sTestAnswer = "";
	String sTestAnswer2 = "";
	String sTestAnswer3 = "";
	String sTestAnswer4 = "";
	
	for(int i=0;i<5;i++){
				UserAnswerArray[i] = wordE.charAt(i);
			}
			for(int j=0;j<5;j++){
				CorrectAnswerArray[j] = Correctword.charAt(j);
			}
			for(int i=0;i<5;i++){
				System.out.println(UserAnswerArray[i]);
			}
			for(int j=0;j<5;j++){
				System.out.println(CorrectAnswerArray[j]);
			}
			System.out.println("\n");
			for(int k=0;k<5;k++){//Test A
				if(CorrectAnswerArray[k] == UserAnswerArray[k])
					{
						TestAnswerArrayAlpha[k] = 'A';
					}
			} 
			for(int k=0;k<5;k++){
				sTestAnswer = sTestAnswer + TestAnswerArrayAlpha[k];
			}
			System.out.println(sTestAnswer);
			
			for(int l=0;l<5;l++){
				for(int m=0;m<5;m++){//Test B
				if(CorrectAnswerArray[l] == UserAnswerArray[m])
					{
						TestAnswerArrayBeta[m] = 'B';
					}
				}
			}
			for(int l=0;l<5;l++){
				sTestAnswer2 = sTestAnswer2 + TestAnswerArrayBeta[l];
			}
			System.out.println(sTestAnswer2);
			
			for(int n=0;n<5;n++){//Test C
				if(CorrectAnswerArray[n] != UserAnswerArray[n])
					{
						TestAnswerArrayCharley[n] = 'C';
					}
			}
			for(int n=0;n<5;n++){
				sTestAnswer3 = sTestAnswer3 + TestAnswerArrayCharley[n];
			}
			for(int n=0;n<5;n++){
				if(TestAnswerArrayAlpha[n] == 'A')
				{
					FinalTestAnswerArray[n] = TestAnswerArrayAlpha[n];
				}else if(TestAnswerArrayBeta[n] == 'B'){
					FinalTestAnswerArray[n] = TestAnswerArrayBeta[n];
				}else{
					FinalTestAnswerArray[n] = TestAnswerArrayCharley[n];
				}
			}
			for(int n=0;n<5;n++){
				sTestAnswer4 = sTestAnswer4 + FinalTestAnswerArray[n];
			}
			System.out.println(sTestAnswer4);
				
			
           