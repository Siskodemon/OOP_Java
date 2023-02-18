package Seminar_1.HomeWork.Seminar_3;

/**
 * Реализовать класс User, с полями firstName, lastName, age, переопределить
 * метод toString()
 * 
 */
public class User {
    private String firstName;
    private String lastName;
    private Integer age;
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "User {"+"firstname"+ firstName + ", lastname" + lastName +", age", age"}";
    }
}
