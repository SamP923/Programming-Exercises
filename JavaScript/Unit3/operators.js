var mymoney=5000;
document.write("My account has $" +mymoney + "<br/>");

mymoney+=2000;
document.write("My account has $" + mymoney+ "<br/>");

result1 = ++mymoney;
document.write("mymoney = " + mymoney + " result 1 = " + result1 + "<br/>");
result2 = mymoney++;
document.write("mymoney = " +mymoney+ " result2 = " +result2+ "<br/>");

mymoney-=2;
mymoney%=1000;
document.write("Now my account has $" + mymoney);