package con_assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class file
{
	public static void main ( String args [])
	{
		String s[]=new String[2000000];
		int aoc[]=new int[2000000];
		int boc[]=new int[2000000];
		int coc[]=new int[2000000];
		int doc[]=new int[2000000];
		int eoc[]=new int[2000000];
		int foc[]=new int[2000000];
		int goc[]=new int[2000000];
		int hoc[]=new int[2000000];
		int toc[]=new int[2000000];
		for(int i=0;i<2000000;i++)
		{
			aoc[i]=0;boc[i]=0;coc[i]=0;doc[i]=0;eoc[i]=0;foc[i]=0;goc[i]=0;hoc[i]=0;toc[i]=0;			
		}
		int adc=0,ac=0,bc=0,cc=0,dc=0,ec=0,fc=0,gc=0,hc=0,tc=0;
		BufferedReader br = null;
		try 
		{
			String actionString;
			br = new BufferedReader(new FileReader("file_1.txt"));

			while ((actionString = br.readLine()) != null) 
			{
				//System.out.println(actionString);
				String delim = "[\\s,;\\t]+"; //insert here all delimitators
				String[] tokens = actionString.split(delim);
				//System.out.println(","+tokens[0]+","+tokens[1]+	","+tokens[2]+",");
				if(tokens[0].equals("talk.politics.mideast"))
				{
					ac+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								aoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							aoc[adc]+=1;
							toc[adc]+=1;
						}
						
					}
				}
				if(tokens[0].equals("talk.politics.guns"))
				{
					
					
					bc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								boc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							boc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
					
				}
				if(tokens[0].equals("talk.politics.misc"))
				{
					cc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								coc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							coc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
					
					
					
				}
				if(tokens[0].equals("talk.religion.misc"))
				{
					dc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								doc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							doc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.sport.hockey"))
				{
					ec+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								eoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							eoc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.autos"))
				{
					fc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								foc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							foc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.sport.baseball"))
				{
					gc+=1;
					tc+=1;
					//System.out.println(gc);
					for(int i=1;i<tokens.length;i++)
					{
						//System.out.println(i+" "+tokens[i]);
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								goc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							goc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.motorcycles"))
				{
					hc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								hoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							hoc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				
				
				
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
			{
				if (br != null)br.close();
			} catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Learnt The First File...");
		
		try 
		{
			String actionString;
			br = new BufferedReader(new FileReader("file_2.txt"));

			while ((actionString = br.readLine()) != null) 
			{
				//System.out.println(actionString);
				String delim = "[\\s,;\\t]+"; //insert here all delimitators
				String[] tokens = actionString.split(delim);
				//System.out.println(","+tokens[0]+","+tokens[1]+","+tokens[2]+",");
				if(tokens[0].equals("talk.politics.mideast"))
				{
					ac+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								aoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							aoc[adc]+=1;
							toc[adc]+=1;
						}
						
					}
				}
				if(tokens[0].equals("talk.politics.guns"))
				{
					
					
					bc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								boc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							boc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
					
				}
				if(tokens[0].equals("talk.politics.misc"))
				{
					cc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								coc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							coc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
					
					
					
				}
				if(tokens[0].equals("talk.religion.misc"))
				{
					dc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								doc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							doc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.sport.hockey"))
				{
					ec+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								eoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							eoc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.autos"))
				{
					fc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								foc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							foc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.sport.baseball"))
				{
					gc+=1;
					tc+=1;
					//System.out.println(gc);
					for(int i=1;i<tokens.length;i++)
					{
						//System.out.println(i+" "+tokens[i]);
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								goc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							goc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.motorcycles"))
				{
					hc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								hoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							hoc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				
				
				
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
			{
				if (br != null)br.close();
			} catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Learnt The Second File...");
		try 
		{
			String actionString;
			br = new BufferedReader(new FileReader("file_3.txt"));

			while ((actionString = br.readLine()) != null) 
			{
				//System.out.println(actionString);
				String delim = "[\\s,;\\t]+"; //insert here all delimitators
				String[] tokens = actionString.split(delim);
				//System.out.println(","+tokens[0]+","+tokens[1]+","+tokens[2]+",");
				if(tokens[0].equals("talk.politics.mideast"))
				{
					ac+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								aoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							aoc[adc]+=1;
							toc[adc]+=1;
						}
						
					}
				}
				if(tokens[0].equals("talk.politics.guns"))
				{
					
					
					bc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								boc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							boc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
					
				}
				if(tokens[0].equals("talk.politics.misc"))
				{
					cc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								coc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							coc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
					
					
					
				}
				if(tokens[0].equals("talk.religion.misc"))
				{
					dc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								doc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							doc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.sport.hockey"))
				{
					ec+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								eoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							eoc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.autos"))
				{
					fc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								foc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							foc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.sport.baseball"))
				{
					gc+=1;
					tc+=1;
					//System.out.println(gc);
					for(int i=1;i<tokens.length;i++)
					{
						//System.out.println(i+" "+tokens[i]);
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								goc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							goc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.motorcycles"))
				{
					hc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								hoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							hoc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				
				
				
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
			{
				if (br != null)br.close();
			} catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Learnt The Third File...");
		try 
		{
			String actionString;
			br = new BufferedReader(new FileReader("file_4.txt"));

			while ((actionString = br.readLine()) != null) 
			{
				//System.out.println(actionString);
				String delim = "[\\s,;\\t]+"; //insert here all delimitators
				String[] tokens = actionString.split(delim);
				//System.out.println(","+tokens[0]+","+tokens[1]+","+tokens[2]+",");
				if(tokens[0].equals("talk.politics.mideast"))
				{
					ac+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								aoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							aoc[adc]+=1;
							toc[adc]+=1;
						}
						
					}
				}
				if(tokens[0].equals("talk.politics.guns"))
				{
					
					
					bc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								boc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							boc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
					
				}
				if(tokens[0].equals("talk.politics.misc"))
				{
					cc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								coc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							coc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
					
					
					
				}
				if(tokens[0].equals("talk.religion.misc"))
				{
					dc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								doc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							doc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.sport.hockey"))
				{
					ec+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								eoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							eoc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.autos"))
				{
					fc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								foc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							foc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.sport.baseball"))
				{
					gc+=1;
					tc+=1;
					//System.out.println(gc);
					for(int i=1;i<tokens.length;i++)
					{
						//System.out.println(i+" "+tokens[i]);
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								goc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							goc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				if(tokens[0].equals("rec.motorcycles"))
				{
					hc+=1;
					tc+=1;
					for(int i=1;i<tokens.length;i++)
					{
						int drum=0;
						for(int j=0;j<adc;j++)
						{
							if(s[j].equals(tokens[i]))
							{
								hoc[j]+=1;
								toc[j]+=1;
								drum=1;
								break;
							}
						}
						if(drum==0)
						{
							s[adc]=tokens[i];
							hoc[adc]+=1;
							toc[adc]+=1;
							adc+=1;
						}
						
					}
				}
				
				
				
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
			{
				if (br != null)br.close();
			} catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Learnt The Forth File...");
		System.out.println("Now Starts the Prediction...!!!");
		//System.out.println(tc+" "+adc+" "+ac+" "+bc+" "+cc);
		
		double ansa[]=new double[1446];
		double ansb[]=new double[1446];
		double ansc[]=new double[1446];
		double ansd[]=new double[1446];
		double anse[]=new double[1446];
		double ansf[]=new double[1446];
		double ansg[]=new double[1446];
		double ansh[]=new double[1446];
		double duma=Math.log(ac);
		double dumb=Math.log(bc);
		double dumc=Math.log(cc);
		double dumd=Math.log(dc);
		double dume=Math.log(ec);
		double dumf=Math.log(fc);
		double dumg=Math.log(gc);
		double dumh=Math.log(hc);
		//System.out.println(duma+" "+dumb+" "+dumc);
		for(int i=0;i<adc;i++)
		{
			if(aoc[i]==0)
			{
				aoc[i]+=1;
				toc[i]+=1;
			}
			if(boc[i]==0)
			{
				boc[i]+=1;
				toc[i]+=1;
			}
			if(coc[i]==0)
			{
				coc[i]+=1;
				toc[i]+=1;
			}
			if(doc[i]==0)
			{
				doc[i]+=1;
				toc[i]+=1;
			}
			if(eoc[i]==0)
			{
				eoc[i]+=1;
				toc[i]+=1;
			}
			if(foc[i]==0)
			{
				foc[i]+=1;
				toc[i]+=1;
			}
			if(goc[i]==0)
			{
				goc[i]+=1;
				toc[i]+=1;
			}
			if(hoc[i]==0)
			{
				hoc[i]+=1;
				toc[i]+=1;
			}
		}
		for(int i=0;i<1446;i++)
		{
			ansa[i]=duma;
			ansb[i]=dumb;
			ansc[i]=dumc;
			ansd[i]=dumd;
			anse[i]=dume;
			ansf[i]=dumf;
			ansg[i]=dumg;
			ansh[i]=dumh;
		}
		int corr_ans[]=new int[1446];
		int my_ans[]=new int[1446];
		int current=0;
		try 
		{
			String actionString;
			br = new BufferedReader(new FileReader("file_0.txt"));//file being predicted

			while ((actionString = br.readLine()) != null) 
			{
				String delim = "[\\s,;\\t]+"; //insert here all delimitators
				String[] tokens = actionString.split(delim);
				
				for(int i=1;i<tokens.length;i++)
				{
					for(int j=0;j<adc;j++)
					{
						if(tokens[i].equals(s[j]))
						{
							ansa[current]+=Math.log(aoc[j]);
							ansb[current]+=Math.log(boc[j]);
							ansc[current]+=Math.log(coc[j]);
							ansd[current]+=Math.log(doc[j]);
							anse[current]+=Math.log(eoc[j]);
							ansf[current]+=Math.log(foc[j]);
							ansg[current]+=Math.log(goc[j]);
							ansh[current]+=Math.log(hoc[j]);
							break;
						}
					}
				}
				if(ansa[current]>ansb[current] && ansa[current]>ansc[current] && ansa[current]>ansd[current] && ansa[current]>anse[current] && ansa[current]>ansf[current]&& ansa[current]>ansg[current] && ansa[current]>ansh[current])
				{
					my_ans[current]=1;
				}
				else if(ansb[current]>ansc[current] && ansb[current]>ansd[current] && ansb[current]>anse[current] && ansb[current]>ansf[current]&& ansb[current]>ansg[current] && ansb[current]>ansh[current])
				{
					my_ans[current]=2;
				}
				else if(ansc[current]>ansd[current] && ansc[current]>anse[current] && ansc[current]>ansf[current]&& ansc[current]>ansg[current] && ansc[current]>ansh[current])
				{
					my_ans[current]=3;
				}
				else if(ansd[current]>anse[current] && ansd[current]>ansf[current]&& ansd[current]>ansg[current] && ansd[current]>ansh[current])
				{
					my_ans[current]=4;
				}
				else if(anse[current]>ansf[current]&& anse[current]>ansg[current] && anse[current]>ansh[current])
				{
					my_ans[current]=5;
				}
				else if(ansf[current]>ansg[current] && ansf[current]>ansh[current])
				{
					my_ans[current]=6;
				}
				else if(ansg[current]>ansh[current])
				{
					my_ans[current]=7;
				}
				else
				{
					my_ans[current]=8;
				}
				if(tokens[0].equals("talk.politics.mideast"))
				{
					corr_ans[current]=1;
				}
				if(tokens[0].equals("talk.politics.guns"))
				{
					corr_ans[current]=2;
				}
				if(tokens[0].equals("talk.politics.misc"))
				{
					corr_ans[current]=3;
				}
				if(tokens[0].equals("talk.religion.misc"))
				{
					corr_ans[current]=4;
				}
				if(tokens[0].equals("rec.sport.hockey"))
				{
					corr_ans[current]=5;
				}
				if(tokens[0].equals("rec.autos"))
				{
					corr_ans[current]=6;
				}
				if(tokens[0].equals("rec.sport.baseball"))
				{
					corr_ans[current]=7;
				}
				if(tokens[0].equals("rec.motorcycles"))
				{
					corr_ans[current]=8;
				}
				current+=1;
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
			{
				if (br != null)br.close();
			} catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
		
		float num_correct=0;
		for(int i=0;i<1446;i++)
		{
			if(corr_ans[i]==my_ans[i])
			{
				num_correct+=1;
			}
		}
		System.out.println("The Accuracy of prediction was :"+num_correct/14.46);
		
		
		
		
		
		
		
		
	}
}
