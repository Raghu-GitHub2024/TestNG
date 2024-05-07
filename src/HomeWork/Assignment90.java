package HomeWork;

public class Assignment90
{	
			void add()
			{
				int a=100;
				System.out.println(a+4);
			}
			void add(int a)
			{
				System.out.println(a+5);
			}
			static void add(double a)
			{
				System.out.println(a+6);
			}
			void add(int a, int b, int c, int d)
			{
				System.out.println(a+b+c+d);
			}
			public static void main(String[] args)
			{
				Assignment90 m1 = new Assignment90();
				m1.add();
				add(0.05);
				m1.add(10);
				m1.add(1, 2, 3, 4);
			}

}
