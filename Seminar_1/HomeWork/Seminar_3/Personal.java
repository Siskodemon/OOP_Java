package Seminar_1.HomeWork.Seminar_3;

import java.util.List;

public class Personal implements Iterable<User>{

private User() users;
 
    List<User> users;

    public Personal(List<User> user){
        this.users = user;
    }

@Override
public Iterator<user> Iterator(){
    return new PersonalIterator();
}

protected class PersonalIterator implements Iterator<User>{

private int index = 0;

    @Override
    public boolean HasNext(){
        return index <  users.length();
    }

    @Override
    public User next() {
        return user[index++];
    }
}

@Override
public java.util.Iterator<User> iterator() {
    // TODO Auto-generated method stub
    return null;
}

}