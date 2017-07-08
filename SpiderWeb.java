
	#include "filterKmapResults.h"
	#include "operation.h"
	class Kmap : public FilterKmapTerms, public SOPtoPOS
	{
	private:
			int	temp, temp1, temp2, temp3; 
		void invokeKmap();
	public:
		Kmap () 
		{
		    invokeKmap();
		}
	};
	void Kmap ::invokeKmap()
		{
			char tempChar;          
			vector<char>result;      
			vector<vector<char>> filterResults; 
		do
		{
			system("cls"); 
			guideWin(1);    
			cout<<"Please, enter your k-map type (Variables number, Maximum 26):";
			do
			{
			type = readInt( temp = 0, false);
			if(type > 26)
				for( int temp1=0; temp1 < temp; temp1++)
					cout<<"\b \b";
			}while(type > 27);
			hasEnteredType = true;
			system("cls");  
			guideWin(2); 
			getPos(ones, "one");           
			system("cls");  
			guideWin(3);     
			getPos(dCare, "don't care");  
			system("cls"); 
			guideWin(4);     
			cout<<"Choose Result's type:\n"
				<<"1-Some of product.\n"
				<<"2-Product of some.\n";
			
			do
			{
			tempChar = getch();
			
			if(tempChar == 49)
			{
				SOP = true;
			}
			else if(tempChar == 50)
			{
				SOP = false;
			}
			else
			{
				cout<<"\a";
			}
			}while(tempChar != 49 && tempChar != 50);
			system("cls");  
			guideWin(5);     /
			result = minimize(ones, dCare); 
			if( result.size() != 1 || 
				( result[0] != 48 && result[0] != 49 ) )
			{
				filterResults.clear();
				filterResults =  filter(result,ones); 
			cout<<"Minimization = ";		
			for(int temp = 0; temp < filterResults.size(); temp++)
			{
				if(filterResults.size() > 1) 
					cout<<endl<<temp+1<<" - ";
				if(SOP == false) convSopToPos(filterResults[temp]);
				for(int temp1 = 0; temp1 < filterResults[temp].size(); temp1++) 
				cout<<filterResults[temp][temp1];
			}
			}
			else
				cout<<"Minimization = "<<result[0]<<endl;
					cout<<endl; 
			tempChar = getch ();     
			if(tempChar == 27) break;  
			{
				ones.clear();
				dCare.clear();
				hasEnteredType = false;
			}
		}while(true);		
	}
	void main ()
	{	
		Kmap k1;
}
