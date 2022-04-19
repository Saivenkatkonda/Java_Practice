class percentage
  {
    public static void main(String args[])
    {
      float tel = 80;
      float hin = 90;
      float eng = 80;
      float sci = 70;
      float maths = 90;
      float total;
      float percentage;
      
      total = tel + hin + eng + sci + maths;
      percentage = ((total/500)*100);
      System.out.println("the percentage ="+percentage + "%");
    }
  }