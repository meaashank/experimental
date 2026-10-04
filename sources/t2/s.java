package T2;

import T2.r;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.K;
import androidx.room.C;
import androidx.room.H0;
import androidx.room.InterfaceC2664h;
import androidx.room.T;
import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2664h
@SuppressLint({"UnknownNullness"})
public interface s {
    @T("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int A(@NonNull String id2, long startTime);

    @T("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<r.b> B(String name);

    @T("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    List<r> C(int schedulerLimit);

    @T("UPDATE workspec SET output=:output WHERE id=:id")
    void D(String id2, Data output);

    @T("SELECT * FROM workspec WHERE state=1")
    List<r> E();

    @H0
    @T("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<r.c> F(String tag);

    @T("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int G(String id2);

    @H0
    @T("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    List<r.c> H(List<String> ids);

    @T("DELETE FROM workspec WHERE id=:id")
    void a(String id2);

    @T("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int b(WorkInfo.State state, String... ids);

    @T("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void c();

    @T("SELECT * FROM workspec WHERE id IN (:ids)")
    r[] d(List<String> ids);

    @T("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<String> e(@NonNull String name);

    @T("SELECT state FROM workspec WHERE id=:id")
    WorkInfo.State f(String id2);

    @T("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    List<String> g(@NonNull String tag);

    @T("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    List<Data> h(String id2);

    @H0
    @T("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    List<r.c> i(String name);

    @T("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
    List<r> j(int maxLimit);

    @C(onConflict = 5)
    void k(r workSpec);

    @H0
    @T("SELECT id FROM workspec")
    K<List<String>> l();

    @H0
    @T("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    K<List<r.c>> m(String name);

    @H0
    @T("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    K<List<r.c>> n(String tag);

    @T("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    List<String> o();

    @T("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean p();

    @T("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int q(String id2);

    @H0
    @T("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    K<List<r.c>> r(List<String> ids);

    @T("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void s(String id2, long periodStartTime);

    @T("SELECT id FROM workspec")
    List<String> t();

    @T("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
    List<r> u(long startingAt);

    @T("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    List<r> v();

    @H0
    @T("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=:id")
    r.c w(String id2);

    @T("SELECT * FROM workspec WHERE id=:id")
    r x(String id2);

    @T("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    K<Long> y(@NonNull String id2);

    @T("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int z();
}
