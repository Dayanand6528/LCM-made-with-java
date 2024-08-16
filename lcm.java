class overload
{
      public int lcm(int a,int b,int c)
    { 
       int i,r=0,l=a*b*c;
    for(i=1;i<=l;i++)
       {
         if(i%a==0 && i%b==0 && i%c==0)
         {
           r=i; 
	  break;
          }
	}
          return r;
       
    }
    public int lcm(int a,int b)
      {
          int i,r=0,l=a*b;
         for(i=1;i<=l;i++)
            {
             if(i%a==0 && i%b==0 ) 
		{
                 r=i;
		break;
		}
	}
		return r;
            
       }
     public int lcm(int a,int b,int c,int d)
       {
          int i,r=0,l=a*b*c*d;
          for(i=1;i<=l;i++)
           {
          if(i%a==0 && i%b==0 && i%c==0 && i%d==0)
             {
		r=i;
		break;
	      }
	}
	return r;
          
        }

}
 class lcm
   {
      public static void main(String args[])
      {
       overload obj=new overload();
        System.out.println("LCM:"+obj.lcm(2,3,4));
      System.out.println("LCM:"+obj.lcm(2,3));
     System.out.println("LCM:"+obj.lcm(2,3,4,5));
      }
  }
