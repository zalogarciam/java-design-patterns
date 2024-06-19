package org.example;

import org.example.adapter.*;
import org.example.bridge.AdvancedRemoteControl;
import org.example.bridge.RemoteControl;
import org.example.bridge.SamsungTV;
import org.example.composite.Form;
import org.example.composite.Group;
import org.example.composite.Shape;
import org.example.facade.AuthToken;
import org.example.facade.Connection;
import org.example.facade.NotificationService;
import org.example.flyweight.PointIconFactory;
import org.example.flyweight.PointService;
import org.example.flyweight.PointType;
import org.example.proxy.EbookProxy;
import org.example.proxy.LoggingEbookProxy;
import org.example.proxy.RealEbook;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        var book = new EbookProxy("test");
//        book.show();
//
//        var book2 = new LoggingEbookProxy("test");
//        book2.show();
//
//        var book3 = new RealEbook("test");
//        book3.show();

//        var factory = new PointIconFactory();
//        factory.getPointIcon(PointType.CAFE);
//        var service = new PointService(factory);
//        service.getPoints();

//        var service = new NotificationService();
//        service.send("Hola", "129.23.21.1" );
//
//        var square = new Shape();
//        var circle = new Shape();
//        var rectangle = new Shape();
//        var triangle = new Form();
//        var group = new Group();
//
//        group.add(square);
//        group.add(circle);
//        group.add(rectangle);
//        group.add(triangle);
//        group.render();

//        var samsungTV = new SamsungTV();
//        var remoteControl = new RemoteControl(samsungTV);
//        remoteControl.turnOn();
//        remoteControl.turnOff();
//        var advancedRemoteControl = new AdvancedRemoteControl(samsungTV);
//        advancedRemoteControl.turnOn();
//        advancedRemoteControl.turnOff();
//        advancedRemoteControl.setChannel(1);

        var image = new Image();
        var imageView = new ImageView(image);
        imageView.apply(new VividFilter());

        imageView.apply(new CaramelAdapter());

    }
}