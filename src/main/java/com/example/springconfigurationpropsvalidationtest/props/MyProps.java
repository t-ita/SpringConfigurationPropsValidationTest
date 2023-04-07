package com.example.springconfigurationpropsvalidationtest.props;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties("my.props")   // application.yml の値が格納されている prefix を指定
@RequiredArgsConstructor   // final なフィールドにセットするために必要
@Getter   // 読み取り専用として、Getter を用意
@Validated   // バーリデーション機能を有効化
public class MyProps {
    @NotNull   // NULL値のバリデーション
    @Size(min = 1)   // 文字列長の最小値でバリデーション
    final String stringValue;
    @Max(100)   // 数値の最大値でバリデーション
    final int intValue;
}
