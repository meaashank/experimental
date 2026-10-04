package com.mbridge.msdk.config.component.midi;

import Z3.f;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.U;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.midi.monitor.c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.CusPlayerView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MidiCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.model.a f154648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CusPlayerView f154649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f154650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f154651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.b f154652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f154653m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f154657q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f154654n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f154655o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f154656p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f154658r = false;

    public class a implements com.mbridge.msdk.config.component.midi.monitor.a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(String str) {
            MidiCpt.this.f154657q = str;
            MidiCpt.this.j();
            MidiCpt.this.g();
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void b(final String str) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.midi.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154661a.c(str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.component.midi.monitor.a
        public void a(String str) {
            MidiCpt.this.a("904010", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        return (int) ((i10 / i11) * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i() {
        HashMap map = new HashMap();
        CusPlayerView cusPlayerView = this.f154649i;
        if (cusPlayerView == null) {
            q0.b("MidiCpt", "mbPlayerView is null in createProgressEventData");
            return map;
        }
        int iCeil = this.f154655o;
        if (iCeil == 0) {
            iCeil = (int) Math.ceil(((double) cusPlayerView.getCurPosition()) / 1000.0d);
        }
        int duration = this.f154656p;
        if (duration == 0) {
            duration = this.f154649i.getDuration();
        }
        int iA = this.f154654n;
        if (iA == 0) {
            iA = a(iCeil, duration);
        }
        map.put(com.mbridge.msdk.config.component.common.util.c.c("percent"), Integer.valueOf(iA));
        map.put(com.mbridge.msdk.config.component.common.util.c.c("progress"), Integer.valueOf(iCeil));
        map.put(com.mbridge.msdk.config.component.common.util.c.c("122"), this.f154649i.isSilent() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.f154648h;
        if (aVar == null) {
            c("PlayerModel is null");
            return;
        }
        if (this.f154649i == null) {
            this.f154649i = aVar.d();
        }
        if (this.f154649i == null) {
            c("PlayerWidget is null");
            return;
        }
        String strB = this.f154648h.b();
        if (TextUtils.isEmpty(strB)) {
            c("Command is empty");
            return;
        }
        try {
            if (com.mbridge.msdk.config.component.common.util.c.c("315").equals(strB)) {
                this.f154658r = true;
                n();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("307").equals(strB)) {
                this.f154658r = false;
                h();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("316").equals(strB)) {
                c cVar = this.f154653m;
                if (cVar != null) {
                    cVar.h();
                }
                this.f154658r = false;
                m();
                return;
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("335").equals(strB)) {
                this.f154658r = true;
                p();
            } else {
                q0.b("MidiCpt", "Unknown command: " + strB);
            }
        } catch (Exception e10) {
            q0.b("MidiCpt", "Error executing player action: " + strB, e10);
            c("Error executing player action: " + e10.getMessage());
        }
    }

    private void k() {
        com.mbridge.msdk.config.component.midi.model.a aVar;
        com.mbridge.msdk.config.component.midi.model.a aVar2;
        if (this.f154652l == null && (aVar2 = this.f154648h) != null && aVar2.c() == 1) {
            this.f154652l = new com.mbridge.msdk.config.component.midi.monitor.b();
        }
        if (this.f154653m != null || (aVar = this.f154648h) == null) {
            return;
        }
        this.f154653m = new c(aVar.g(), this.f154648h.j());
    }

    private void l() {
        if (this.f154651k == null) {
            this.f154651k = new a();
        }
        if (this.f154650j == null) {
            this.f154650j = new b();
        }
    }

    private void m() {
        CusPlayerView cusPlayerView = this.f154649i;
        if (cusPlayerView != null) {
            cusPlayerView.pause();
        }
        b("904003", i());
    }

    private void n() {
        if (this.f154648h == null || this.f154649i == null) {
            c("play params is null");
            return;
        }
        if (TextUtils.isEmpty(this.f154657q)) {
            c("Video URL is empty");
            return;
        }
        if (!TextUtils.isEmpty(this.f154648h.e())) {
            try {
                this.f154649i.setMixWithOtherAudio(Integer.valueOf(this.f154648h.e()).intValue());
            } catch (NumberFormatException e10) {
                q0.b("MidiCpt", "Invalid mixWithOtherAudio value: " + this.f154648h.e(), e10);
            }
        }
        if (this.f154649i.getCurPosition() > 1) {
            p();
            return;
        }
        int iA = this.f154648h.a();
        if (iA >= 0) {
            this.f154649i.initBufferIngParam(iA);
        }
        CusPlayerView cusPlayerView = this.f154649i;
        String str = this.f154657q;
        cusPlayerView.initVFPData(str, str, this.f154650j);
        this.f154649i.setVideoGravity(this.f154648h.i());
        this.f154649i.playVideo();
        b("904004", i());
    }

    private void p() {
        CusPlayerView cusPlayerView = this.f154649i;
        if (cusPlayerView != null) {
            cusPlayerView.resumeStart();
            c cVar = this.f154653m;
            if (cVar != null && cVar.e()) {
                this.f154653m.h();
            }
        }
        b("904004", i());
    }

    public void o() {
        try {
            CusPlayerView cusPlayerView = this.f154649i;
            if (cusPlayerView != null) {
                cusPlayerView.stop();
                this.f154649i.release();
                this.f154649i = null;
            }
            c cVar = this.f154653m;
            if (cVar != null) {
                cVar.b();
                this.f154653m = null;
            }
            if (this.f154652l != null) {
                this.f154652l = null;
            }
            if (this.f154648h != null) {
                this.f154648h = null;
            }
            this.f154650j = null;
            this.f154651k = null;
        } catch (Exception e10) {
            q0.b("MidiCpt", "Error in release", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CusPlayerView cusPlayerView = this.f154649i;
        if (cusPlayerView == null || this.f154648h == null) {
            q0.b("MidiCpt", "check mute params is null");
            return;
        }
        if ((cusPlayerView.isSilent() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL).equals(this.f154648h.f())) {
            return;
        }
        if (MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(this.f154648h.f())) {
            this.f154649i.openSound();
        } else {
            this.f154649i.closeSound();
        }
        b("904006", i());
    }

    private void h() {
        CusPlayerView cusPlayerView = this.f154649i;
        if (cusPlayerView != null) {
            cusPlayerView.stop();
        }
        b("904009", i());
        o();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            q0.b("MidiCpt", "execute " + this);
            l();
            c cVar = this.f154653m;
            if (cVar != null) {
                cVar.a(this.f154651k);
                this.f154653m.g();
            } else {
                c("TimeOutPlayerMonitor is null");
            }
        } catch (Exception e10) {
            q0.b("MidiCpt", "Error in execute", e10);
            c("Error in execute: " + e10.getMessage());
        }
        a("904011", (HashMap<String, Object>) null);
    }

    public class b implements com.mbridge.msdk.config.dynamic.baseview.video.a {
        public b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j10) {
            if (MidiCpt.this.f154653m != null) {
                MidiCpt.this.f154653m.f();
            }
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904002", (Map<String, Object>) midiCpt.i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingEnd() {
            q0.b("BufferState", "缓冲结束");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingStart() {
            q0.b("BufferState", "开始缓冲");
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onBufferingTimeOut(String str) {
            q0.b("BufferState", "缓冲超时");
            MidiCpt.this.a("904010", str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayCompleted() {
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.b("904007", (Map<String, Object>) midiCpt.i());
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void onPlayError(String str) {
            MidiCpt.this.c(str);
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.a
        public void a(long j10, long j11) {
            MidiCpt.this.f154655o = U.a(j10);
            MidiCpt.this.f154656p = U.a(j11);
            MidiCpt midiCpt = MidiCpt.this;
            midiCpt.f154654n = midiCpt.a(midiCpt.f154655o, MidiCpt.this.f154656p);
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("percent"), Integer.valueOf(MidiCpt.this.f154654n));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("progress"), Long.valueOf(j10));
            map.put(com.mbridge.msdk.config.component.common.util.c.c("122"), MidiCpt.this.f154649i.isSilent() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            MidiCpt.this.b("904005", map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        com.mbridge.msdk.config.component.midi.model.a aVar = this.f154648h;
        if (aVar == null) {
            q0.b("MidiCpt", "playerModel is null, cannot parse event config");
        } else {
            aVar.b(map);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f154192f = "904001";
        this.f154648h = new com.mbridge.msdk.config.component.midi.model.a(map);
        try {
            ViewGroup viewGroupE = e();
            if (viewGroupE != null) {
                if (!TextUtils.isEmpty(this.f154648h.h())) {
                    this.f154649i = (CusPlayerView) e().findViewWithTag(this.f154648h.h());
                } else {
                    this.f154649i = (CusPlayerView) com.mbridge.msdk.config.dynamic.utils.d.a(viewGroupE, CusPlayerView.class);
                }
            }
            CusPlayerView cusPlayerView = this.f154649i;
            if (cusPlayerView == null) {
                q0.b("MidiCpt", "Failed to get CusPlayerView from root view");
            } else {
                this.f154648h.a(cusPlayerView);
            }
        } catch (Exception e10) {
            q0.b("MidiCpt", "Error getting CusPlayerView", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str);
        b("904008", map);
        o();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        k();
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = map.get(com.mbridge.msdk.config.component.common.util.c.c("16"));
                if (obj instanceof Map) {
                    Object obj2 = ((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("116"));
                    if (obj2 instanceof String) {
                        String strValueOf = String.valueOf(obj2);
                        if (!TextUtils.isEmpty(strValueOf)) {
                            return strValueOf.equals(this.f154648h.j());
                        }
                    }
                }
            } catch (Throwable th) {
                q0.b("MidiCpt", th.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Map<String, Object> map) {
        a(a(str, map));
        com.mbridge.msdk.config.component.midi.monitor.b bVar = this.f154652l;
        if (bVar != null) {
            bVar.a(str, this.f154190d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Map<String, Object> mapI = i();
        mapI.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str2);
        mapI.put(com.mbridge.msdk.config.component.common.util.c.c(f.f79422s), "4001");
        b(str, mapI);
        o();
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("MidiCpt", "eventName is null");
            return;
        }
        str.getClass();
        if (!str.equals("onStop")) {
            if (str.equals("onResume") && this.f154658r) {
                p();
                return;
            }
            return;
        }
        m();
    }
}
