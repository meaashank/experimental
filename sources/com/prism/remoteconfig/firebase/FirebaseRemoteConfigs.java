package com.prism.remoteconfig.firebase;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pb.InterfaceC5401a;
import pb.InterfaceC5402b;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseRemoteConfigs implements InterfaceC5402b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f194124c = 43200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FirebaseRemoteConfig f194125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<InterfaceC5401a> f194126b = new ArrayList<>();

    public class a implements OnCompleteListener<Void> {

        /* JADX INFO: renamed from: com.prism.remoteconfig.firebase.FirebaseRemoteConfigs$a$a, reason: collision with other inner class name */
        public class C0698a implements OnCompleteListener<Boolean> {
            public C0698a() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NonNull Task<Boolean> task) {
                FirebaseRemoteConfigs.this.o(task);
            }
        }

        public a() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<Void> task) {
            if (task.isSuccessful()) {
                FirebaseRemoteConfigs.this.f194125a.fetchAndActivate().addOnCompleteListener(new C0698a());
            } else {
                FirebaseRemoteConfigs.this.o(task);
            }
        }
    }

    @Override // pb.InterfaceC5402b
    public void a(String str, Object obj) {
        if (l()) {
            i(new HashMap<String, Object>(str, obj) { // from class: com.prism.remoteconfig.firebase.FirebaseRemoteConfigs.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f194127a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Object f194128b;

                {
                    this.f194127a = str;
                    this.f194128b = obj;
                    put(str, obj);
                }
            });
        }
    }

    @Override // pb.InterfaceC5402b
    public boolean b(String str) {
        if (l()) {
            return this.f194125a.getBoolean(str);
        }
        return false;
    }

    @Override // pb.InterfaceC5402b
    public long c(String str) {
        if (l()) {
            return this.f194125a.getLong(str);
        }
        return 0L;
    }

    @Override // pb.InterfaceC5402b
    public double d(String str, double d10) {
        return l() ? this.f194125a.getDouble(str) : d10;
    }

    @Override // pb.InterfaceC5402b
    public String e(String str) {
        return l() ? this.f194125a.getString(str) : "";
    }

    @Override // pb.InterfaceC5402b
    public double f(String str) {
        if (l()) {
            return this.f194125a.getDouble(str);
        }
        return 0.0d;
    }

    @Override // pb.InterfaceC5402b
    public void g(Context context, InterfaceC5401a interfaceC5401a) {
        h(context, interfaceC5401a, f194124c);
    }

    @Override // pb.InterfaceC5402b
    public boolean getBoolean(String str, boolean z10) {
        return l() ? this.f194125a.getBoolean(str) : z10;
    }

    @Override // pb.InterfaceC5402b
    public long getLong(String str, long j10) {
        return l() ? this.f194125a.getLong(str) : j10;
    }

    @Override // pb.InterfaceC5402b
    public String getString(String str, String str2) {
        return l() ? this.f194125a.getString(str) : str2;
    }

    @Override // pb.InterfaceC5402b
    public void h(Context context, InterfaceC5401a interfaceC5401a, long j10) {
        if (n(j10)) {
            if (interfaceC5401a != null) {
                interfaceC5401a.a();
            }
        } else {
            if (interfaceC5401a != null) {
                this.f194126b.add(interfaceC5401a);
            }
            this.f194125a = FirebaseRemoteConfig.getInstance();
            this.f194125a.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(2000L).build());
            this.f194125a.fetch(j10).addOnCompleteListener(new a());
        }
    }

    @Override // pb.InterfaceC5402b
    public void i(Map<String, Object> map) {
        this.f194125a.setDefaultsAsync(map);
    }

    public final boolean l() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.f194125a;
        return firebaseRemoteConfig != null && firebaseRemoteConfig.getInfo().getLastFetchStatus() == -1;
    }

    public boolean m() {
        return l();
    }

    public final boolean n(long j10) {
        if (!l() || j10 <= 0) {
            return false;
        }
        long fetchTimeMillis = this.f194125a.getInfo().getFetchTimeMillis();
        if (fetchTimeMillis <= 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - fetchTimeMillis;
        return jCurrentTimeMillis >= 0 && jCurrentTimeMillis < j10 * 1000;
    }

    public final void o(@NonNull Task<?> task) {
        ArrayList<InterfaceC5401a> arrayList = this.f194126b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<InterfaceC5401a> arrayList2 = this.f194126b;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            InterfaceC5401a interfaceC5401a = arrayList2.get(i10);
            i10++;
            InterfaceC5401a interfaceC5401a2 = interfaceC5401a;
            if (task.isSuccessful()) {
                interfaceC5401a2.a();
            } else {
                interfaceC5401a2.onFailed(task.getException() == null ? "internal error" : task.getException().getMessage());
            }
        }
        this.f194126b.clear();
    }
}
