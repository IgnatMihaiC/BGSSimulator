package com.example.mihai.bgssimulator.Simultor.FeedData;

import com.example.mihai.bgssimulator.RealmClasses.RealmModels.BarometerValueModel;
import com.example.mihai.bgssimulator.RealmClasses.RealmModels.GpsValueModel;
import com.example.mihai.bgssimulator.RealmClasses.RealmModels.OrientationValueModel;
import com.example.mihai.bgssimulator.RealmClasses.RealmModels.PDRValueModel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by mihai on 06.03.2017.
 */

public class DownloadDBData implements DownloadData {

    public DownloadDBData() {
    }

    @Override
    public List<BarometerValueModel> getBarometerDatas() {
        List<BarometerValueModel> barometerValueQueue = new LinkedList<>();
        RealmResults<BarometerValueModel> barometerQueryResult = Realm.getDefaultInstance().where(BarometerValueModel.class).findAll();
        for (int i = 0; i < barometerQueryResult.size(); i++) {
            barometerValueQueue.add(barometerQueryResult.get(i));
        }
        return barometerValueQueue;
    }

    @Override
    public List<OrientationValueModel> getOrientationDatas() {
        List<OrientationValueModel> orientationValueQueue = new ArrayList<>();
        RealmResults<OrientationValueModel> orientationQueryResult = Realm.getDefaultInstance().where(OrientationValueModel.class).findAll();
        for (int i = 0; i < orientationQueryResult.size(); i++) {
            orientationValueQueue.add(orientationQueryResult.get(i));
        }
        return orientationValueQueue;
    }

    @Override
    public List<GpsValueModel> getGPSDatas() {
        List<GpsValueModel> gpsValueQueue = new LinkedList<>();
        RealmResults<GpsValueModel> gpsQueryResult = Realm.getDefaultInstance().where(GpsValueModel.class).findAll();
        for (int i = 0; i < gpsQueryResult.size(); i++) {
            gpsValueQueue.add(gpsQueryResult.get(i));
        }
        return gpsValueQueue;
    }

    @Override
    public List<PDRValueModel> getPDRDatas() {
        List<PDRValueModel> pdrValueQueue = new LinkedList<>();
        RealmResults<PDRValueModel> pdrQueryResult = Realm.getDefaultInstance().where(PDRValueModel.class).findAll();
        for (int i = 0; i < pdrQueryResult.size(); i++) {
            pdrValueQueue.add(pdrQueryResult.get(i));
        }
        return pdrValueQueue;
    }

    @Override
    public Long getFirstTimeStamp() {
        return null;
    }


}