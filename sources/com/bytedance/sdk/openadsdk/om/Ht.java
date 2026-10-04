package com.bytedance.sdk.openadsdk.om;

import R9.c;
import Z3.f;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Ht {
    private WeakReference<FA> NOt;
    private Context ZRu;
    private Map<String, ZRu> mZ = new HashMap();
    private SensorEventListener uR = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.om.Ht.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            FA faUR;
            if (sensorEvent.sensor.getType() != 1 || (faUR = Ht.this.uR()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                faUR.ZRu("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener TFq = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.om.Ht.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            FA faUR;
            if (sensorEvent.sensor.getType() != 4 || (faUR = Ht.this.uR()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                faUR.ZRu("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener Ht = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.om.Ht.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            FA faUR;
            if (sensorEvent.sensor.getType() != 10 || (faUR = Ht.this.uR()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                faUR.ZRu("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener Mm = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.om.Ht.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = aT.NOt;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = aT.mZ;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = aT.uR;
            SensorManager.getRotationMatrix(fArr5, null, aT.NOt, aT.mZ);
            float[] fArr6 = aT.TFq;
            SensorManager.getOrientation(fArr5, fArr6);
            FA faUR = Ht.this.uR();
            if (faUR == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                faUR.ZRu("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    public interface ZRu {
        JSONObject ZRu(JSONObject jSONObject) throws Throwable;
    }

    public Ht(FA fa2) {
        this.ZRu = fa2.ZRu();
        this.NOt = new WeakReference<>(fa2);
        mZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.om.ZRu TFq() {
        FA faUR = uR();
        if (faUR == null) {
            return null;
        }
        return faUR.WMI();
    }

    private void mZ() {
        this.mZ.put("adInfo", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.45
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                if (faUR == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOm = faUR.om();
                if (jSONObjectOm != null) {
                    jSONObjectOm.put(f.f79422s, 1);
                    return jSONObjectOm;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(f.f79422s, -1);
                return jSONObject3;
            }
        });
        this.mZ.put("appInfo", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.56
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(f.f79422s, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = Ht.this.ZRu().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                FA faUR = Ht.this.uR();
                if (faUR != null) {
                    jSONObject2.put("deviceId", faUR.Mm());
                    jSONObject2.put("netType", faUR.yBV());
                    jSONObject2.put("innerAppName", faUR.uR());
                    jSONObject2.put("appName", faUR.TFq());
                    jSONObject2.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, faUR.Ht());
                    Map<String, String> mapNOt = faUR.NOt();
                    for (String str : mapNOt.keySet()) {
                        jSONObject2.put(str, mapNOt.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.mZ.put("playableSDKInfo", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.61
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(f.f79422s, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.mZ.put("subscribe_app_ad", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.62
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.om.ZRu zRuTFq = Ht.this.TFq();
                JSONObject jSONObject2 = new JSONObject();
                if (zRuTFq == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("download_app_ad", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.63
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.om.ZRu zRuTFq = Ht.this.TFq();
                JSONObject jSONObject2 = new JSONObject();
                if (zRuTFq == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("isViewable", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.2
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                if (faUR == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(f.f79422s, 1);
                jSONObject3.put("viewStatus", faUR.Vor());
                return jSONObject3;
            }
        });
        this.mZ.put("getVolume", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.3
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                if (faUR == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(f.f79422s, 1);
                jSONObject3.put("endcard_mute", faUR.FA());
                return jSONObject3;
            }
        });
        this.mZ.put("getScreenSize", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.4
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                if (faUR == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectQF = faUR.qF();
                jSONObjectQF.put(f.f79422s, 1);
                return jSONObjectQF;
            }
        });
        this.mZ.put("start_accelerometer_observer", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.5
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        Mm.ZRu("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put(f.f79422s, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                aT.ZRu(Ht.this.ZRu, Ht.this.uR, iOptInt);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("close_accelerometer_observer", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.6
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    aT.ZRu(Ht.this.ZRu, Ht.this.uR);
                    jSONObject2.put(f.f79422s, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    Mm.ZRu("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put(f.f79422s, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.mZ.put("start_gyro_observer", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.7
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        Mm.ZRu("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put(f.f79422s, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                aT.NOt(Ht.this.ZRu, Ht.this.TFq, iOptInt);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("close_gyro_observer", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.8
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    aT.ZRu(Ht.this.ZRu, Ht.this.TFq);
                    jSONObject2.put(f.f79422s, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    Mm.ZRu("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put(f.f79422s, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.mZ.put("start_accelerometer_grativityless_observer", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.9
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        Mm.ZRu("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put(f.f79422s, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                aT.mZ(Ht.this.ZRu, Ht.this.Ht, iOptInt);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("close_accelerometer_grativityless_observer", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.10
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    aT.ZRu(Ht.this.ZRu, Ht.this.Ht);
                    jSONObject2.put(f.f79422s, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    Mm.ZRu("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put(f.f79422s, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.mZ.put("start_rotation_vector_observer", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.11
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        Mm.ZRu("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put(f.f79422s, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                aT.uR(Ht.this.ZRu, Ht.this.Mm, iOptInt);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("close_rotation_vector_observer", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.13
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    aT.ZRu(Ht.this.ZRu, Ht.this.Mm);
                    jSONObject2.put(f.f79422s, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    Mm.ZRu("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put(f.f79422s, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.mZ.put("device_shake", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.14
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    aT.ZRu(Ht.this.ZRu, 300L);
                    jSONObject2.put(f.f79422s, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    Mm.ZRu("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(f.f79422s, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.mZ.put("device_shake_short", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.15
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    aT.ZRu(Ht.this.ZRu, 150L);
                    jSONObject2.put(f.f79422s, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    Mm.ZRu("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(f.f79422s, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.mZ.put("playable_style", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.16
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectMZ = faUR.mZ();
                jSONObjectMZ.put(f.f79422s, 1);
                return jSONObjectMZ;
            }
        });
        this.mZ.put("sendReward", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.17
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.to();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("webview_time_track", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.18
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.mZ.put("playable_event", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.19
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null || jSONObject == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.NOt(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("reportAd", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.20
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.21
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("openAdLandPageLinks", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.22
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("get_viewport", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.24
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOCA = faUR.OCA();
                jSONObjectOCA.put(f.f79422s, 1);
                return jSONObjectOCA;
            }
        });
        this.mZ.put("jssdk_load_finish", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.25
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.th();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_material_render_result", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.26
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.Vor(jSONObject);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("detect_change_playable_click", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.27
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectAT = faUR.aT();
                jSONObjectAT.put(f.f79422s, 1);
                return jSONObjectAT;
            }
        });
        this.mZ.put("check_camera_permission", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.28
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSAl = faUR.sAl();
                jSONObjectSAl.put(f.f79422s, 1);
                return jSONObjectSAl;
            }
        });
        this.mZ.put("check_external_storage", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.29
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectEdo = faUR.edo();
                if (jSONObjectEdo.isNull(c.f67796d)) {
                    jSONObjectEdo.put(f.f79422s, -1);
                    return jSONObjectEdo;
                }
                jSONObjectEdo.put(f.f79422s, 1);
                return jSONObjectEdo;
            }
        });
        this.mZ.put("playable_open_camera", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.30
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_pick_photo", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.31
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_download_media_in_photos", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.32
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.ZRu(jSONObject);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_preventTouchEvent", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.33
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.NOt(jSONObject);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_settings_info", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.35
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOK = faUR.oK();
                jSONObjectOK.put(f.f79422s, 1);
                return jSONObjectOK;
            }
        });
        this.mZ.put("playable_load_main_scene", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.36
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.xY();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_enter_section", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.37
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.uR(jSONObject);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_end", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.38
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.Zf();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_finish_play_playable", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.39
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.ru();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_transfrom_module_show", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.40
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.le();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_transfrom_module_change_color", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.41
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.MR();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_set_scroll_rect", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.42
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_click_area", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.43
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.TFq(jSONObject);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_real_play_start", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.44
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_material_first_frame_show", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.46
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.fcs();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_stuck_check_pong", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.47
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.Nb();
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_material_adnormal_mask", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.48
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                faUR.Ht(jSONObject);
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_long_press_panel", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.49
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_alpha_player_play", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.50
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_transfrom_module_highlight", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.51
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_send_click_event", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.52
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_query_media_permission_declare", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.53
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectMm = faUR.Mm(jSONObject);
                jSONObjectMm.put(f.f79422s, 1);
                return jSONObjectMm;
            }
        });
        this.mZ.put("playable_query_media_permission_enable", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.54
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                FA faUR = Ht.this.uR();
                JSONObject jSONObject2 = new JSONObject();
                if (faUR == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectFA = faUR.FA(jSONObject);
                jSONObjectFA.put(f.f79422s, 1);
                return jSONObjectFA;
            }
        });
        this.mZ.put("playable_apply_media_permission", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.55
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.om.ZRu zRuTFq = Ht.this.TFq();
                JSONObject jSONObject2 = new JSONObject();
                if (zRuTFq == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_start_kws", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.57
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.om.ZRu zRuTFq = Ht.this.TFq();
                JSONObject jSONObject2 = new JSONObject();
                if (zRuTFq == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_close_kws", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.58
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.om.ZRu zRuTFq = Ht.this.TFq();
                JSONObject jSONObject2 = new JSONObject();
                if (zRuTFq == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_video_preload_task_add", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.59
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.om.ZRu zRuTFq = Ht.this.TFq();
                JSONObject jSONObject2 = new JSONObject();
                if (zRuTFq == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
        this.mZ.put("playable_video_preload_task_cancel", new ZRu() { // from class: com.bytedance.sdk.openadsdk.om.Ht.60
            @Override // com.bytedance.sdk.openadsdk.om.Ht.ZRu
            public JSONObject ZRu(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.om.ZRu zRuTFq = Ht.this.TFq();
                JSONObject jSONObject2 = new JSONObject();
                if (zRuTFq == null) {
                    jSONObject2.put(f.f79422s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(f.f79422s, 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FA uR() {
        WeakReference<FA> weakReference = this.NOt;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void NOt() {
        aT.ZRu(this.ZRu, this.uR);
        aT.ZRu(this.ZRu, this.TFq);
        aT.ZRu(this.ZRu, this.Ht);
        aT.ZRu(this.ZRu, this.Mm);
    }

    public Set<String> ZRu() {
        return this.mZ.keySet();
    }

    public JSONObject ZRu(String str, JSONObject jSONObject) {
        try {
            ZRu zRu = this.mZ.get(str);
            if (zRu == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(f.f79422s, -1);
                return jSONObject2;
            }
            return zRu.ZRu(jSONObject);
        } catch (Throwable th) {
            Mm.ZRu("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
