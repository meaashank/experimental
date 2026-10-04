package com.bytedance.sdk.component.Vor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.Mm;
import com.bytedance.sdk.component.utils.le;
import com.bytedance.sdk.component.utils.ru;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements View.OnTouchListener, ru.ZRu {
    private volatile float FA;
    private final Context Ht;
    private volatile float Mm;
    private final int NOt;
    private View.OnTouchListener OCA;
    private final int TFq;
    private float WMI;
    private long ZH;
    private long lp;
    private final int mZ;
    private String om;
    private float qF;
    private int sAl;
    private ViewConfiguration to;
    private final List<Integer> uR;
    private boolean yBV;
    private float Vor = -1.0f;
    private float aT = -1.0f;
    private final Handler oK = new ru(Mm.ZRu().getLooper(), this);
    InterfaceC0413ZRu ZRu = new InterfaceC0413ZRu() { // from class: com.bytedance.sdk.component.Vor.ZRu.1
        @Override // com.bytedance.sdk.component.Vor.ZRu.InterfaceC0413ZRu
        public void ZRu() {
            if (ZRu.this.Vor == -1.0f && ZRu.this.aT == -1.0f && ZRu.this.lp == -1) {
                float unused = ZRu.this.Vor;
                float unused2 = ZRu.this.aT;
                ZRu zRu = ZRu.this;
                zRu.Vor = zRu.Mm;
                ZRu zRu2 = ZRu.this;
                zRu2.aT = zRu2.FA;
                ZRu zRu3 = ZRu.this;
                zRu3.lp = zRu3.ZH;
                ZRu.this.yBV = true;
            }
            float unused3 = ZRu.this.Vor;
            float unused4 = ZRu.this.aT;
        }

        @Override // com.bytedance.sdk.component.Vor.ZRu.InterfaceC0413ZRu
        public void ZRu(int i10) {
            ZRu.this.sAl = i10;
            ZRu.this.NOt();
        }
    };
    private int xY = -1;
    private final List<Integer> edo = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.Vor.ZRu$ZRu, reason: collision with other inner class name */
    public interface InterfaceC0413ZRu {
        void ZRu();

        void ZRu(int i10);
    }

    public ZRu(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.Ht = context;
        if (i10 == -1) {
            this.NOt = le.ZRu(context);
        } else {
            this.NOt = le.ZRu(context, i10);
        }
        this.mZ = le.ZRu(context, i11);
        this.uR = list;
        this.TFq = i12;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.ZH = SystemClock.elapsedRealtime();
        this.Mm = x10;
        this.FA = y10;
        if (action == 0) {
            this.WMI = x10;
            this.qF = y10;
        } else if (action == 1 && ZRu(x10, y10)) {
            int iZRu = ZRu(this.Mm, this.FA, this.ZH);
            boolean zContains = this.edo.contains(Integer.valueOf(this.sAl));
            ZRu(view, motionEvent, iZRu, !zContains);
            if (!zContains) {
                this.edo.add(Integer.valueOf(this.sAl));
            }
            if (iZRu == 0) {
                motionEvent.setAction(3);
            }
        }
        View.OnTouchListener onTouchListener = this.OCA;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt() {
        this.Vor = -1.0f;
        this.aT = -1.0f;
        this.lp = -1L;
    }

    public void ZRu(View.OnTouchListener onTouchListener) {
        this.OCA = onTouchListener;
    }

    public InterfaceC0413ZRu ZRu() {
        return this.ZRu;
    }

    private void ZRu(View view, MotionEvent motionEvent, int i10, boolean z10) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i10 == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z10 ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i10);
        jSONObject.put("current_url_index", this.sAl);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.oK.sendMessageDelayed(messageObtain, 200L);
    }

    private boolean ZRu(float f10, float f11) {
        if (this.to == null) {
            this.to = ViewConfiguration.get(this.Ht);
        }
        if (this.xY == -1) {
            this.xY = this.to.getScaledTouchSlop();
        }
        return Math.abs(f10 - this.WMI) <= ((float) this.xY) && Math.abs(f11 - this.qF) <= ((float) this.xY);
    }

    public void ZRu(String str) {
        this.om = str;
    }

    private int ZRu(float f10, float f11, long j10) {
        if (this.Vor == -1.0f && this.aT == -1.0f && this.lp == -1) {
            return 1;
        }
        if (!this.uR.contains(Integer.valueOf(this.sAl))) {
            return 2;
        }
        if (j10 - this.lp > this.TFq) {
            NOt();
            return 3;
        }
        float fAbs = Math.abs(f10 - this.Vor);
        float fAbs2 = Math.abs(f11 - this.aT);
        if (fAbs <= this.NOt / 2.0f && fAbs2 <= this.mZ / 2.0f) {
            return 0;
        }
        NOt();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.ru.ZRu
    public void ZRu(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.yBV ? 1 : 0);
                    this.yBV = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.Vor.ZRu.ZRu.ZRu().NOt() != null) {
                com.bytedance.sdk.component.Vor.ZRu.ZRu.ZRu().NOt().ZRu(this.om, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
