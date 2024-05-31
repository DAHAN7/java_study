package test1;

import java.util.Objects;

public class Member {
    private String id;
    private String password;
    private String name;

    // 기본 생성자
    public Member() {
    }

    // getter와 setter를 이용해 접근 가능하도록 함
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Member other = (Member) obj;
        return Objects.equals(id, other.id) && Objects.equals(password, other.password);
    }
}