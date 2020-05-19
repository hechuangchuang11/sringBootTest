# sringBootTest
# 通用mapper的使用注意事项
public interface UserMapper extends Mapper<UmsMember>
1 接口继承Mapper
2 参数类必须是和相关表名一致，符合驼峰
@Valid 的使用，用于传参的校验 如@NotBlank(message = "用户名不能为空")