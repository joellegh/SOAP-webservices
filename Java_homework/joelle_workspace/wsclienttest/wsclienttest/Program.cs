using System;
using System.Collections.Generic;
using System.Text;

namespace wsclienttest
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("testing webservice from c# console application\nplease provide usercode:");
            String usercode = Console.ReadLine();
            Console.Write("enter password:");
            String password = Console.ReadLine();
            wsdemo.WSService webservice = new wsdemo.WSService();
            String ret = webservice.authenticate(usercode, password);
            Console.WriteLine(webservice.sayHello());
            Console.WriteLine("service returned: " + ret);

            Console.WriteLine(webservice.add(1, 2));
            Console.Read();
        }
    }
}
