package nguyenvannhat.android.com.activeandroid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Project ActiveAndroid
 * Created by Nguyen Van Nhat on 03/22/2016.
 */
@Table(name = "User")
public class User extends Model {

    @Column(name = "Name")
    public String name;

    @Column(name = "Address")
    public String address;

    @Column(name = "Phone")
    public String phone;

    @Column(name = "Age")
    public int age;

    public User() {
    }

    public User(String name, String address, String phone, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }
}
