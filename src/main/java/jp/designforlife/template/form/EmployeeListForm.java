package jp.designforlife.template.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import jp.designforlife.template.validator.annotation.Memo;
import lombok.Data;

@Data
public class EmployeeListForm {
	@NotEmpty
    private String name;
	@NotNull
	@Min(18)
    private Integer age;
	@Memo(50)
	private String memo;
}
