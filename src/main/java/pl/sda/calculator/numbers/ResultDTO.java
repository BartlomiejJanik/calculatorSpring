package pl.sda.calculator.numbers;

import java.util.List;

public class ResultDTO {
    private Integer result;
    private List<String> resultList;

    public ResultDTO(Integer result, List<String> resultList) {
        this.result = result;
        this.resultList = resultList;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public List<String> getResultList() {
        return resultList;
    }

    public void setResultList(List<String> resultList) {
        this.resultList = resultList;
    }
}
