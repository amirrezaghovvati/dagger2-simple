package com.example.dagger_till_module_binds_provide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;

import com.example.dagger_till_module_binds_provide.Car.Car;
import com.example.dagger_till_module_binds_provide.Car.CarComponent;
import com.example.dagger_till_module_binds_provide.Car.DaggerCarComponent;
import com.example.dagger_till_module_binds_provide.HttpClient.DaggerServiceComponent;
import com.example.dagger_till_module_binds_provide.HttpClient.Retrofit;
import com.example.dagger_till_module_binds_provide.HttpClient.SendService;
import com.example.dagger_till_module_binds_provide.HttpClient.ServiceComponent;
import com.example.dagger_till_module_binds_provide.Mobile.DaggerMobileComponent;
import com.example.dagger_till_module_binds_provide.Mobile.Mobile;
import com.example.dagger_till_module_binds_provide.Mobile.MobileComponent;
import com.example.dagger_till_module_binds_provide.Pc.DaggerPcComponent;
import com.example.dagger_till_module_binds_provide.Pc.LoadingImage;
import com.example.dagger_till_module_binds_provide.Pc.PcComponent;
import com.example.dagger_till_module_binds_provide.Pc.PersonalComputer;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;
    PersonalComputer personalComputer;
    SendService sendService;
    Mobile mobile;
    LoadingImage loadingImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PcComponent component= DaggerPcComponent.create();
        personalComputer=component.createPc();
        personalComputer.runPc();
        ServiceComponent serviceComponent= DaggerServiceComponent.create();
        sendService=serviceComponent.createService();
        sendService.sendRequst("Url","GET");
        MobileComponent mobileComponent= DaggerMobileComponent.create();
        mobile=mobileComponent.createMobile();
        mobile.runMobile();
        ImageComponent imageComponent=DaggerImageComponent.create();
        loadingImage=imageComponent.buildImage();
        loadingImage.loadImage();
        CarComponent carComponent= DaggerCarComponent.create();
        carComponent.injectFileds(this);
        car.turnOn();
    }
}