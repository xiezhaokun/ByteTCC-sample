package com.bytesvc.provider.main;

import org.bytesoft.bytetcc.supports.springcloud.config.SpringCloudSecondaryConfiguration;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * ���������ȸ��ؾ���(ʹ��MongoDB�洢������־):������SpringCloudConfiguration; <br />
 * ���������ȸ��ؾ���(ʹ���ļ�ϵͳ�洢������־):������SpringCloudSecondaryConfiguration;
 */
@Import(SpringCloudSecondaryConfiguration.class)
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.bytesvc.provider")
@EnableAutoConfiguration(exclude = { MongoAutoConfiguration.class }) // ʹ���ļ��洢ʱ, ����Ҫ����mongodb
public class SampleProviderMain {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SampleProviderMain.class).run(args);
		System.out.println("springcloud-sample-provider started!");
	}

}
