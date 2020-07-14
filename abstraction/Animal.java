abstract class Animal {
  //here all animals make same noise so this is not abstract
  public void sleep(){System.out.println("zzz");}  
  //   every animal has it own sound so this function is not abstract
  public abstract void makeSound();
}
