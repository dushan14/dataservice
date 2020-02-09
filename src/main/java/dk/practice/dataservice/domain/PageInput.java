package dk.practice.dataservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
@NoArgsConstructor
public class PageInput {

    @ApiModelProperty(required = false, value = "size of the page to be returned", example = "10")
    private int pageSize = 10;

    @ApiModelProperty(required = false, value = "index of the page", example = "0")
    private int pageNo = 0;

    @ApiModelProperty(required = false, value = "sort by field", example = "name")
    private String sortBy;

    @ApiModelProperty(required = false, value = "sort direction", example = "ASC")
    private Sort.Direction direction = Sort.Direction.ASC;

    public static Pageable getPageable(PageInput pageInput) {
        if (pageInput == null) pageInput = new PageInput();
        if (pageInput.getSortBy().isEmpty()) {
            return PageRequest.of(pageInput.getPageNo(), pageInput.getPageSize());
        }
        return PageRequest.of(pageInput.getPageNo(), pageInput.getPageSize(), Sort.by(pageInput.getDirection(), pageInput.getSortBy()));
    }

}
