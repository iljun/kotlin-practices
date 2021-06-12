class Person(
    val name: String,
    var married: Boolean) {
    val lastName: String
    get() = this.name.split("")[0]
}

// val keyword의 경우 private와 getter를 생성해준다.
// var keyword의 경우 private와 getter, setter를 생성해준다.


/**
 * public class Person {
 *      private String name;
 *      private boolean married;
 *
 *      public Person(String name, boolean married) {
 *          this.name = name;
 *          this.married = married;
 *      }
 *
 *      public String getName() {
 *          return this.name;
 *      }
 *
 *      public boolean isMarried() {
 *          return this.married;
 *      }
 *
 *      public void setMarried(boolean married) {
 *          this.married = married;
 *      }
 * }
 */
