package kotlin.time;

import kotlin.time.Instant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface x {

    public static final class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f218461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final CharSequence f218462b;

        public a(@NotNull String error, @NotNull CharSequence input) {
            kotlin.jvm.internal.G.p(error, "error");
            kotlin.jvm.internal.G.p(input, "input");
            this.f218461a = error;
            this.f218462b = input;
        }

        @Override // kotlin.time.x
        @Nullable
        public Instant a() {
            return null;
        }

        @NotNull
        public final String b() {
            return this.f218461a;
        }

        @NotNull
        public final CharSequence c() {
            return this.f218462b;
        }

        @Override // kotlin.time.x
        @NotNull
        public Instant toInstant() {
            throw new InstantFormatException(this.f218461a + " when parsing an Instant from \"" + w.D(this.f218462b, 64) + '\"');
        }
    }

    public static final class b implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f218463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f218464b;

        public b(long j10, int i10) {
            this.f218463a = j10;
            this.f218464b = i10;
        }

        @Override // kotlin.time.x
        @Nullable
        public Instant a() {
            long j10 = this.f218463a;
            Instant.a aVar = Instant.f218393c;
            aVar.getClass();
            if (j10 < Instant.f218394d.f218396a) {
                return null;
            }
            long j11 = this.f218463a;
            aVar.getClass();
            if (j11 > Instant.f218395e.f218396a) {
                return null;
            }
            return aVar.c(this.f218463a, this.f218464b);
        }

        public final long b() {
            return this.f218463a;
        }

        public final int c() {
            return this.f218464b;
        }

        @Override // kotlin.time.x
        @NotNull
        public Instant toInstant() {
            long j10 = this.f218463a;
            Instant.a aVar = Instant.f218393c;
            aVar.getClass();
            if (j10 >= Instant.f218394d.f218396a) {
                long j11 = this.f218463a;
                aVar.getClass();
                if (j11 <= Instant.f218395e.f218396a) {
                    return aVar.c(this.f218463a, this.f218464b);
                }
            }
            throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + this.f218463a + ')');
        }
    }

    @Nullable
    Instant a();

    @NotNull
    Instant toInstant();
}
