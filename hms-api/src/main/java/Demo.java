import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Description:
 * @Auther:PD
 * @Date:2020/6/18 21: 41
 */
@AllArgsConstructor //注解：表示生成带有所有属性的构造方法
@NoArgsConstructor //注解：表示生成不带参数的构方法
@Data //注解：表示生成get和set方法
@ToString
public class Demo implements Serializable {//序列化
    private String name;
    private Long id;
    private Double price;
}
