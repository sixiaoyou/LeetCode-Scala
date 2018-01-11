package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode412_FizzBuzz {
  def fizzBuzz(n: Int): List[String] = {
    var list = List[String]()
    for(i<- 1 to n){
      if(i%3==0&&i%5!=0){
        list =list:+"Fizz";
      }else if(i%3!=0&&i%5==0){
        list =list:+"Buzz";
      }else if(i%3==0&&i%5==0){
        list =list:+"FizzBuzz";
      }else{
        list =list:+String.valueOf(i);
      }
    }
    return list;
  }
}
