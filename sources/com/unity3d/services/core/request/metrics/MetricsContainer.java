package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MetricsContainer {
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final MetricCommonTags _commonTags;
    private final String _metricSampleRate;
    private final List<Metric> _metrics;
    private final String _sTkn;
    private final String _shSid = Session.Default.getId();
    private final String _apiLevel = String.valueOf(Device.getApiLevel());
    private final String _deviceModel = Device.getModel();
    private final String _deviceName = Device.getDevice();
    private final String _deviceManufacturer = Device.getManufacturer();
    private final String _gameId = ClientProperties.getGameId();

    public MetricsContainer(String str, MetricCommonTags metricCommonTags, List<Metric> list, String str2) {
        this._metricSampleRate = str;
        this._commonTags = metricCommonTags;
        this._metrics = list;
        this._sTkn = str2;
    }

    public Map<String, Object> asMap() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<Metric> it = this._metrics.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().asMap());
        }
        map.put(METRIC_CONTAINER_SAMPLE_RATE, this._metricSampleRate);
        map.put("m", arrayList);
        map.put(METRICS_CONTAINER_TAGS, this._commonTags.asMap());
        map.put(METRIC_CONTAINER_SESSION_TOKEN, this._sTkn);
        map.put(METRIC_CONTAINER_SHARED_SESSION_ID, this._shSid);
        String str = this._apiLevel;
        if (str != null) {
            map.put(METRIC_CONTAINER_API_LEVEL, str);
        }
        String str2 = this._deviceModel;
        if (str2 != null) {
            map.put(METRIC_CONTAINER_DEVICE_MODEL, str2);
        }
        String str3 = this._deviceName;
        if (str3 != null) {
            map.put(METRIC_CONTAINER_DEVICE_NAME, str3);
        }
        String str4 = this._deviceManufacturer;
        if (str4 != null) {
            map.put(METRIC_CONTAINER_DEVICE_MAKE, str4);
        }
        String str5 = this._gameId;
        if (str5 != null) {
            map.put(METRIC_CONTAINER_GAME_ID, str5);
        }
        return map;
    }
}
