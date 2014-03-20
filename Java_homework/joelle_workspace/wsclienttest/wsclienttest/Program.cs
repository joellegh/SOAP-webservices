using System;
using System.Collections.Generic;
using System.Text;

namespace wsclienttest
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1=0, n2=0;
            Console.Write("testing webservice from c# console application\nplease provide usercode:");
            String usercode = Console.ReadLine();
            Console.Write("enter password:");
            String password = Console.ReadLine();
            wsdemo.WSService webservice = new wsdemo.WSService();
            String ret = webservice.authenticate(usercode, password);
            

            Console.WriteLine("service returned: " + ret);
            Console.WriteLine("-----------------");
            Console.WriteLine("enter a number n1: ");
            try
            {
                 n1 = Int32.Parse(Console.ReadLine());
            }
            catch (Exception)
            {
                Console.WriteLine("Please enter a valid number!");
            }
            Console.WriteLine("enter another number n2: ");
            try
            {
                n2 = Int32.Parse(Console.ReadLine());
            }
            catch (Exception)
            {
                Console.WriteLine("Please enter a valid number!");
            }
            if (n1 > 0 && n2 > 0)
            {
                Console.WriteLine("n1 + n2 = "+ webservice.add(n1, n2));
            }
            else
                Console.WriteLine("Numbers should be different than 0!");
            Console.Read();
        }
    }
}
