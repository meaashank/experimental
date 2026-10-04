package j3;

import com.bumptech.glide.load.engine.prefill.PreFillType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: j3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4778b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<PreFillType, Integer> f212528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<PreFillType> f212529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f212530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f212531d;

    public C4778b(Map<PreFillType, Integer> map) {
        this.f212528a = map;
        this.f212529b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.f212530c = num.intValue() + this.f212530c;
        }
    }

    public int a() {
        return this.f212530c;
    }

    public boolean b() {
        return this.f212530c == 0;
    }

    public PreFillType c() {
        PreFillType preFillType = this.f212529b.get(this.f212531d);
        Integer num = this.f212528a.get(preFillType);
        if (num.intValue() == 1) {
            this.f212528a.remove(preFillType);
            this.f212529b.remove(this.f212531d);
        } else {
            this.f212528a.put(preFillType, Integer.valueOf(num.intValue() - 1));
        }
        this.f212530c--;
        this.f212531d = this.f212529b.isEmpty() ? 0 : (this.f212531d + 1) % this.f212529b.size();
        return preFillType;
    }
}
