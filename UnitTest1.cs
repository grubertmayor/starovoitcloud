using Microsoft.VisualStudio.TestTools.UnitTesting;
using NUnit.Framework;
using System;

namespace UnitTestProjectStar
{
    [TestClass]
    [TestFixture]
    public class UnitTest1
    {

        //[TestMethod]
        Calc calc = new Calc();
        [Test]
        public void TestMethodAdd()
        {
            
            double expected = 123;
            double actual;

            actual = calc.Add(120, 3);
            NUnit.Framework.Assert.AreEqual(expected, actual, 0.0001);
        }
        [Test]
        public void TestMethodHello()
        {
            
            string expected = "Hello Abu";
            string actual;

            actual = calc.Hello("Abu");
            NUnit.Framework.Assert.AreEqual(expected, actual);

        }
    }
}
