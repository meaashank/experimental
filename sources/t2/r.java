package T2;

import Y6.d;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Index;
import androidx.room.InterfaceC2662g;
import androidx.room.InterfaceC2679p;
import androidx.room.InterfaceC2680q;
import androidx.room.P;
import androidx.room.s0;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import e.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jacoco.core.runtime.AgentOptions;
import p.InterfaceC5376a;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2680q(indices = {@Index({"schedule_requested_at"}), @Index({"period_start_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f68217t = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @P
    @InterfaceC2662g(name = "id")
    public String f68219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "state")
    public WorkInfo.State f68220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "worker_class_name")
    public String f68221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC2662g(name = "input_merger_class_name")
    public String f68222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "input")
    public Data f68223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = AgentOptions.OUTPUT)
    public Data f68224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC2662g(name = "initial_delay")
    public long f68225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @InterfaceC2662g(name = "interval_duration")
    public long f68226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InterfaceC2662g(name = "flex_duration")
    public long f68227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    @InterfaceC2679p
    public Constraints f68228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @D(from = 0)
    @InterfaceC2662g(name = "run_attempt_count")
    public int f68229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "backoff_policy")
    public BackoffPolicy f68230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InterfaceC2662g(name = "backoff_delay_duration")
    public long f68231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InterfaceC2662g(name = "period_start_time")
    public long f68232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @InterfaceC2662g(name = "minimum_retention_duration")
    public long f68233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @InterfaceC2662g(name = "schedule_requested_at")
    public long f68234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @InterfaceC2662g(name = "run_in_foreground")
    public boolean f68235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    @InterfaceC2662g(name = "out_of_quota_policy")
    public OutOfQuotaPolicy f68236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f68216s = androidx.work.i.f("WorkSpec");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final InterfaceC5376a<List<c>, List<WorkInfo>> f68218u = new a();

    public class a implements InterfaceC5376a<List<c>, List<WorkInfo>> {
        @Override // p.InterfaceC5376a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WorkInfo> apply(List<c> input) {
            if (input == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(input.size());
            Iterator<c> it = input.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            return arrayList;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @InterfaceC2662g(name = "id")
        public String f68237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @InterfaceC2662g(name = "state")
        public WorkInfo.State f68238b;

        public boolean equals(Object o10) {
            if (this == o10) {
                return true;
            }
            if (!(o10 instanceof b)) {
                return false;
            }
            b bVar = (b) o10;
            if (this.f68238b != bVar.f68238b) {
                return false;
            }
            return this.f68237a.equals(bVar.f68237a);
        }

        public int hashCode() {
            return this.f68238b.hashCode() + (this.f68237a.hashCode() * 31);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @InterfaceC2662g(name = "id")
        public String f68239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @InterfaceC2662g(name = "state")
        public WorkInfo.State f68240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @InterfaceC2662g(name = AgentOptions.OUTPUT)
        public Data f68241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @InterfaceC2662g(name = "run_attempt_count")
        public int f68242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @s0(entity = u.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {d.C0152d.f79310d})
        public List<String> f68243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @s0(entity = o.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        public List<Data> f68244f;

        @NonNull
        public WorkInfo a() {
            List<Data> list = this.f68244f;
            return new WorkInfo(UUID.fromString(this.f68239a), this.f68240b, this.f68241c, this.f68243e, (list == null || list.isEmpty()) ? Data.f120218c : this.f68244f.get(0), this.f68242d);
        }

        public boolean equals(Object o10) {
            if (this == o10) {
                return true;
            }
            if (!(o10 instanceof c)) {
                return false;
            }
            c cVar = (c) o10;
            if (this.f68242d != cVar.f68242d) {
                return false;
            }
            String str = this.f68239a;
            if (str == null ? cVar.f68239a != null : !str.equals(cVar.f68239a)) {
                return false;
            }
            if (this.f68240b != cVar.f68240b) {
                return false;
            }
            Data data = this.f68241c;
            if (data == null ? cVar.f68241c != null : !data.equals(cVar.f68241c)) {
                return false;
            }
            List<String> list = this.f68243e;
            if (list == null ? cVar.f68243e != null : !list.equals(cVar.f68243e)) {
                return false;
            }
            List<Data> list2 = this.f68244f;
            List<Data> list3 = cVar.f68244f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f68239a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            WorkInfo.State state = this.f68240b;
            int iHashCode2 = (iHashCode + (state != null ? state.hashCode() : 0)) * 31;
            Data data = this.f68241c;
            int iHashCode3 = (((iHashCode2 + (data != null ? data.hashCode() : 0)) * 31) + this.f68242d) * 31;
            List<String> list = this.f68243e;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<Data> list2 = this.f68244f;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public r(@NonNull String id2, @NonNull String workerClassName) {
        this.f68220b = WorkInfo.State.ENQUEUED;
        Data data = Data.f120218c;
        this.f68223e = data;
        this.f68224f = data;
        this.f68228j = Constraints.f120208i;
        this.f68230l = BackoffPolicy.EXPONENTIAL;
        this.f68231m = 30000L;
        this.f68234p = -1L;
        this.f68236r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f68219a = id2;
        this.f68221c = workerClassName;
    }

    public long a() {
        if (c()) {
            return Math.min(WorkRequest.f120237e, this.f68230l == BackoffPolicy.LINEAR ? this.f68231m * ((long) this.f68229k) : (long) Math.scalb(this.f68231m, this.f68229k - 1)) + this.f68232n;
        }
        if (!d()) {
            long jCurrentTimeMillis = this.f68232n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f68225g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f68232n;
        long j11 = j10 == 0 ? jCurrentTimeMillis2 + this.f68225g : j10;
        long j12 = this.f68227i;
        long j13 = this.f68226h;
        if (j12 != j13) {
            return j11 + j13 + (j10 == 0 ? j12 * (-1) : 0L);
        }
        return j11 + (j10 != 0 ? j13 : 0L);
    }

    public boolean b() {
        return !Constraints.f120208i.equals(this.f68228j);
    }

    public boolean c() {
        return this.f68220b == WorkInfo.State.ENQUEUED && this.f68229k > 0;
    }

    public boolean d() {
        return this.f68226h != 0;
    }

    public void e(long backoffDelayDuration) {
        if (backoffDelayDuration > WorkRequest.f120237e) {
            androidx.work.i.c().h(f68216s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            backoffDelayDuration = 18000000;
        }
        if (backoffDelayDuration < 10000) {
            androidx.work.i.c().h(f68216s, "Backoff delay duration less than minimum value", new Throwable[0]);
            backoffDelayDuration = 10000;
        }
        this.f68231m = backoffDelayDuration;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && r.class == o10.getClass()) {
            r rVar = (r) o10;
            if (this.f68225g != rVar.f68225g || this.f68226h != rVar.f68226h || this.f68227i != rVar.f68227i || this.f68229k != rVar.f68229k || this.f68231m != rVar.f68231m || this.f68232n != rVar.f68232n || this.f68233o != rVar.f68233o || this.f68234p != rVar.f68234p || this.f68235q != rVar.f68235q || !this.f68219a.equals(rVar.f68219a) || this.f68220b != rVar.f68220b || !this.f68221c.equals(rVar.f68221c)) {
                return false;
            }
            String str = this.f68222d;
            if (str == null ? rVar.f68222d != null : !str.equals(rVar.f68222d)) {
                return false;
            }
            if (this.f68223e.equals(rVar.f68223e) && this.f68224f.equals(rVar.f68224f) && this.f68228j.equals(rVar.f68228j) && this.f68230l == rVar.f68230l && this.f68236r == rVar.f68236r) {
                return true;
            }
        }
        return false;
    }

    public void f(long intervalDuration) {
        if (intervalDuration < PeriodicWorkRequest.f120223g) {
            androidx.work.i.c().h(f68216s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(PeriodicWorkRequest.f120223g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        g(intervalDuration, intervalDuration);
    }

    public void g(long intervalDuration, long flexDuration) {
        if (intervalDuration < PeriodicWorkRequest.f120223g) {
            androidx.work.i.c().h(f68216s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(PeriodicWorkRequest.f120223g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        if (flexDuration < 300000) {
            androidx.work.i.c().h(f68216s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            flexDuration = 300000;
        }
        if (flexDuration > intervalDuration) {
            androidx.work.i.c().h(f68216s, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(intervalDuration)), new Throwable[0]);
            flexDuration = intervalDuration;
        }
        this.f68226h = intervalDuration;
        this.f68227i = flexDuration;
    }

    public int hashCode() {
        int iA = androidx.compose.foundation.text.modifiers.l.a(this.f68221c, (this.f68220b.hashCode() + (this.f68219a.hashCode() * 31)) * 31, 31);
        String str = this.f68222d;
        int iHashCode = (this.f68224f.hashCode() + ((this.f68223e.hashCode() + ((iA + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j10 = this.f68225g;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f68226h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f68227i;
        int iHashCode2 = (this.f68230l.hashCode() + ((((this.f68228j.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f68229k) * 31)) * 31;
        long j13 = this.f68231m;
        int i12 = (iHashCode2 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f68232n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f68233o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f68234p;
        return this.f68236r.hashCode() + ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f68235q ? 1 : 0)) * 31);
    }

    @NonNull
    public String toString() {
        return android.support.v4.media.e.a(new StringBuilder("{WorkSpec: "), this.f68219a, "}");
    }

    public r(@NonNull r other) {
        this.f68220b = WorkInfo.State.ENQUEUED;
        Data data = Data.f120218c;
        this.f68223e = data;
        this.f68224f = data;
        this.f68228j = Constraints.f120208i;
        this.f68230l = BackoffPolicy.EXPONENTIAL;
        this.f68231m = 30000L;
        this.f68234p = -1L;
        this.f68236r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f68219a = other.f68219a;
        this.f68221c = other.f68221c;
        this.f68220b = other.f68220b;
        this.f68222d = other.f68222d;
        this.f68223e = new Data(other.f68223e);
        this.f68224f = new Data(other.f68224f);
        this.f68225g = other.f68225g;
        this.f68226h = other.f68226h;
        this.f68227i = other.f68227i;
        this.f68228j = new Constraints(other.f68228j);
        this.f68229k = other.f68229k;
        this.f68230l = other.f68230l;
        this.f68231m = other.f68231m;
        this.f68232n = other.f68232n;
        this.f68233o = other.f68233o;
        this.f68234p = other.f68234p;
        this.f68235q = other.f68235q;
        this.f68236r = other.f68236r;
    }
}
