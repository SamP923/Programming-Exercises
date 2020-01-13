public class Date
{

    public Date()
    {
        month = 0;
        day = 0;
        year = 0;
    }

    public Date(int i, int j, int k)
    {
        month = editMonth(i);
        day = editDay(j);
        year = editYear(k);
    }

    public void setDate(int i, int j, int k)
    {
        month = editMonth(i);
        day = editDay(j);
        year = editYear(k);
    }

    public String getDate()
    {
        String s = (new StringBuilder()).append(month).append("/").append(day).append("/").append(year).toString();
        return s;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    protected int editMonth(int i)
    {
        int j = i;
        boolean flag = false;
        while(!flag) 
            if(j >= 1 && j <= 12)
            {
                flag = true;
            } else
            {
                j = Input.getInt("Month must be 1 - 12");
                flag = false;
            }
        return j;
    }

    protected int editDay(int i)
    {
        int j = i;
        boolean flag = false;
        int ai[] = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 
            30, 31
        };
        if(month < 1 || month > 12)
            month = editMonth(month);
        while(!flag) 
            if(j >= 1 && j <= ai[month - 1])
            {
                flag = true;
            } else
            {
                j = Input.getInt((new StringBuilder()).append("Day must be 1 - ").append(ai[month - 1]).toString());
                flag = false;
            }
        return j;
    }

    protected int editYear(int i)
    {
        int j = i;
        boolean flag = false;
        while(!flag) 
            if(j > 0)
            {
                flag = true;
            } else
            {
                j = Input.getInt("Year must be greater than 0");
                flag = false;
            }
        return j;
    }

    private int month;
    private int day;
    private int year;
}