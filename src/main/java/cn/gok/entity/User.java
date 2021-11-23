package cn.gok.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;

    private String username;
    private String nickName;

    private String password;

    private String email;

    private String phone;

    private String avatar;
    private String address;
    private String age;
    private String sex;
    private String createTime;
    @TableField(exist = false)
    private  String token;
    private String role;





}
