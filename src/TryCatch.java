public class TryCatch {
    public static void main(String[] args) {
        int [] nums = new int[10];
        int i = 100;
        try {
            nums[i] = 100;
        } catch (Exception e){
            System.out.println("Well that didn't go well");
            System.out.println(e);
        }
       // if (i > nums.length){
      //      throw new RuntimeException("Yo Bozo, that's not a valid index");
      //  }
       // nums[i] = 100;

    }
}
