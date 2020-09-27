package com.fastenum.dto;

import lombok.Data;

import java.util.List;

/**
 * @Description : 枚举值实体
 * @Author : zhangMing
 * @Date : Created in 18:05 2020-09-27
 */
@Data
public class CodeEnumDTO {

    /**
     * 代码编号
     */
    private String codeId;

    /**
     * 枚举值集合
     */
    private List<Enum> enumList;

    /**
     * 代码状态. 0为禁用，1为启用
     */
    private String state;


    @Data
    public class Enum {

        /**
         * 枚举值编号
         */
        private String enumId;

        /**
         * 枚举值描述
         */
        private String enumDesc;

        /**
         * 语种
         */
        private String language;

        /**
         * 枚举值状态. 0为禁用，1为启用
         */
        private String status;

    }

}
