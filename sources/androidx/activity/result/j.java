package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.C2382e;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import d.AbstractC4282a;
import e.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f85048h = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f85049i = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f85050j = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f85051k = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f85052l = "ActivityResultRegistry";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f85053m = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Integer, String> f85054a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Integer> f85055b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, e> f85056c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<String> f85057d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Map<String, d<?>> f85058e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, Object> f85059f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f85060g = new Bundle();

    public class a implements InterfaceC2611y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f85061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.a f85062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC4282a f85063c;

        public a(String str, androidx.activity.result.a aVar, AbstractC4282a abstractC4282a) {
            this.f85061a = str;
            this.f85062b = aVar;
            this.f85063c = abstractC4282a;
        }

        @Override // androidx.lifecycle.InterfaceC2611y
        public void onStateChanged(@NonNull B b10, @NonNull Lifecycle.Event event) {
            if (!Lifecycle.Event.ON_START.equals(event)) {
                if (Lifecycle.Event.ON_STOP.equals(event)) {
                    j.this.f85058e.remove(this.f85061a);
                    return;
                } else {
                    if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        j.this.l(this.f85061a);
                        return;
                    }
                    return;
                }
            }
            j.this.f85058e.put(this.f85061a, new d<>(this.f85062b, this.f85063c));
            if (j.this.f85059f.containsKey(this.f85061a)) {
                Object obj = j.this.f85059f.get(this.f85061a);
                j.this.f85059f.remove(this.f85061a);
                this.f85062b.a(obj);
            }
            ActivityResult activityResult = (ActivityResult) j.this.f85060g.getParcelable(this.f85061a);
            if (activityResult != null) {
                j.this.f85060g.remove(this.f85061a);
                this.f85062b.a(this.f85063c.c(activityResult.getResultCode(), activityResult.getData()));
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class b<I> extends g<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f85065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC4282a f85066b;

        public b(String str, AbstractC4282a abstractC4282a) {
            this.f85065a = str;
            this.f85066b = abstractC4282a;
        }

        @Override // androidx.activity.result.g
        @NonNull
        public AbstractC4282a<I, ?> a() {
            return this.f85066b;
        }

        @Override // androidx.activity.result.g
        public void c(I i10, @Nullable C2382e c2382e) throws Exception {
            Integer num = j.this.f85055b.get(this.f85065a);
            if (num != null) {
                j.this.f85057d.add(this.f85065a);
                try {
                    j.this.f(num.intValue(), this.f85066b, i10, c2382e);
                    return;
                } catch (Exception e10) {
                    j.this.f85057d.remove(this.f85065a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f85066b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.g
        public void d() {
            j.this.l(this.f85065a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class c<I> extends g<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f85068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC4282a f85069b;

        public c(String str, AbstractC4282a abstractC4282a) {
            this.f85068a = str;
            this.f85069b = abstractC4282a;
        }

        @Override // androidx.activity.result.g
        @NonNull
        public AbstractC4282a<I, ?> a() {
            return this.f85069b;
        }

        @Override // androidx.activity.result.g
        public void c(I i10, @Nullable C2382e c2382e) throws Exception {
            Integer num = j.this.f85055b.get(this.f85068a);
            if (num != null) {
                j.this.f85057d.add(this.f85068a);
                try {
                    j.this.f(num.intValue(), this.f85069b, i10, c2382e);
                    return;
                } catch (Exception e10) {
                    j.this.f85057d.remove(this.f85068a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f85069b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.g
        public void d() {
            j.this.l(this.f85068a);
        }
    }

    public static class d<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.activity.result.a<O> f85071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC4282a<?, O> f85072b;

        public d(androidx.activity.result.a<O> aVar, AbstractC4282a<?, O> abstractC4282a) {
            this.f85071a = aVar;
            this.f85072b = abstractC4282a;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f85073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<InterfaceC2611y> f85074b = new ArrayList<>();

        public e(@NonNull Lifecycle lifecycle) {
            this.f85073a = lifecycle;
        }

        public void a(@NonNull InterfaceC2611y interfaceC2611y) {
            this.f85073a.c(interfaceC2611y);
            this.f85074b.add(interfaceC2611y);
        }

        public void b() {
            ArrayList<InterfaceC2611y> arrayList = this.f85074b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                InterfaceC2611y interfaceC2611y = arrayList.get(i10);
                i10++;
                this.f85073a.g(interfaceC2611y);
            }
            this.f85074b.clear();
        }
    }

    public final void a(int i10, String str) {
        this.f85054a.put(Integer.valueOf(i10), str);
        this.f85055b.put(str, Integer.valueOf(i10));
    }

    @I
    public final boolean b(int i10, int i11, @Nullable Intent intent) {
        String str = this.f85054a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f85058e.get(str));
        return true;
    }

    @I
    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        androidx.activity.result.a<?> aVar;
        String str = this.f85054a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d<?> dVar = this.f85058e.get(str);
        if (dVar == null || (aVar = dVar.f85071a) == null) {
            this.f85060g.remove(str);
            this.f85059f.put(str, o10);
            return true;
        }
        if (!this.f85057d.remove(str)) {
            return true;
        }
        aVar.a(o10);
        return true;
    }

    public final <O> void d(String str, int i10, @Nullable Intent intent, @Nullable d<O> dVar) {
        if (dVar == null || dVar.f85071a == null || !this.f85057d.contains(str)) {
            this.f85059f.remove(str);
            this.f85060g.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            dVar.f85071a.a(dVar.f85072b.c(i10, intent));
            this.f85057d.remove(str);
        }
    }

    public final int e() {
        Random.f218007a.getClass();
        int iQ = Random.f218008b.q(2147418112);
        while (true) {
            int i10 = iQ + 65536;
            if (!this.f85054a.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            Random.f218007a.getClass();
            iQ = Random.f218008b.q(2147418112);
        }
    }

    @I
    public abstract <I, O> void f(int i10, @NonNull AbstractC4282a<I, O> abstractC4282a, @SuppressLint({"UnknownNullness"}) I i11, @Nullable C2382e c2382e);

    public final void g(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f85048h);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f85049i);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f85057d = bundle.getStringArrayList(f85050j);
        this.f85060g.putAll(bundle.getBundle(f85051k));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f85055b.containsKey(str)) {
                Integer numRemove = this.f85055b.remove(str);
                if (!this.f85060g.containsKey(str)) {
                    this.f85054a.remove(numRemove);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList(f85048h, new ArrayList<>(this.f85055b.values()));
        bundle.putStringArrayList(f85049i, new ArrayList<>(this.f85055b.keySet()));
        bundle.putStringArrayList(f85050j, new ArrayList<>(this.f85057d));
        bundle.putBundle(f85051k, (Bundle) this.f85060g.clone());
    }

    @NonNull
    public final <I, O> g<I> i(@NonNull String str, @NonNull B b10, @NonNull AbstractC4282a<I, O> abstractC4282a, @NonNull androidx.activity.result.a<O> aVar) {
        Lifecycle lifecycle = b10.getLifecycle();
        if (lifecycle.d().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + b10 + " is attempting to register while current state is " + lifecycle.d() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        e eVar = this.f85056c.get(str);
        if (eVar == null) {
            eVar = new e(lifecycle);
        }
        eVar.a(new a(str, aVar, abstractC4282a));
        this.f85056c.put(str, eVar);
        return new b(str, abstractC4282a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <I, O> g<I> j(@NonNull String str, @NonNull AbstractC4282a<I, O> abstractC4282a, @NonNull androidx.activity.result.a<O> aVar) {
        k(str);
        this.f85058e.put(str, new d<>(aVar, abstractC4282a));
        if (this.f85059f.containsKey(str)) {
            Object obj = this.f85059f.get(str);
            this.f85059f.remove(str);
            aVar.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f85060g.getParcelable(str);
        if (activityResult != null) {
            this.f85060g.remove(str);
            aVar.a(abstractC4282a.c(activityResult.getResultCode(), activityResult.getData()));
        }
        return new c(str, abstractC4282a);
    }

    public final void k(String str) {
        if (this.f85055b.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    @I
    public final void l(@NonNull String str) {
        Integer numRemove;
        if (!this.f85057d.contains(str) && (numRemove = this.f85055b.remove(str)) != null) {
            this.f85054a.remove(numRemove);
        }
        this.f85058e.remove(str);
        if (this.f85059f.containsKey(str)) {
            StringBuilder sbA = i.a("Dropping pending result for request ", str, ": ");
            sbA.append(this.f85059f.get(str));
            Log.w(f85052l, sbA.toString());
            this.f85059f.remove(str);
        }
        if (this.f85060g.containsKey(str)) {
            StringBuilder sbA2 = i.a("Dropping pending result for request ", str, ": ");
            sbA2.append(this.f85060g.getParcelable(str));
            Log.w(f85052l, sbA2.toString());
            this.f85060g.remove(str);
        }
        e eVar = this.f85056c.get(str);
        if (eVar != null) {
            eVar.b();
            this.f85056c.remove(str);
        }
    }
}
