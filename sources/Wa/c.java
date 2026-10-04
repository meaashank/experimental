package Wa;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.SimpleExoPlayerView;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.prism.commons.utils.C3861z;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.r;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import t1.C5596a;

/* JADX INFO: loaded from: classes7.dex */
public class c extends Da.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f76664k = l0.b(c.class.getSimpleName());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3861z<c, Context> f76665l = new C3861z<>(new Wa.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExchangeFile f76666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExtractorMediaSource f76668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SimpleExoPlayer f76669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SimpleExoPlayerView f76670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnTouchListener f76671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f76672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Player.EventListener f76673j = new a();

    public static /* synthetic */ c s(Context context) {
        c cVar = new c();
        Da.b.h(cVar);
        return cVar;
    }

    public static c x(Context context) {
        return f76665l.a(context);
    }

    public int A() {
        return this.f76667d;
    }

    public boolean B() {
        return this.f76669f != null;
    }

    public final /* synthetic */ void C(int i10) {
        if (i10 == 0) {
            this.f76672i = true;
            j(10);
        } else {
            this.f76672i = false;
            j(11);
        }
    }

    public void D(Context context, ExchangeFile exchangeFile, int i10, SimpleExoPlayerView simpleExoPlayerView) {
        if (exchangeFile == null) {
            return;
        }
        if (B()) {
            if (this.f76666c.equals(exchangeFile)) {
                w(simpleExoPlayerView);
                j(1);
                return;
            }
            F();
        }
        this.f76666c = exchangeFile;
        this.f76667d = i10;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(new DefaultBandwidthMeter()));
        this.f76668e = new ExtractorMediaSource.Factory(new Xa.b(exchangeFile)).createMediaSource(Uri.parse(exchangeFile.getId()));
        SimpleExoPlayer simpleExoPlayerNewSimpleInstance = ExoPlayerFactory.newSimpleInstance(context, defaultTrackSelector);
        this.f76669f = simpleExoPlayerNewSimpleInstance;
        simpleExoPlayerNewSimpleInstance.addListener(this.f76673j);
        this.f76669f.prepare(this.f76668e);
        w(simpleExoPlayerView);
        j(1);
        d();
    }

    public void E(View.OnTouchListener onTouchListener) {
        this.f76671h = onTouchListener;
    }

    public void F() {
        SimpleExoPlayer simpleExoPlayer = this.f76669f;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
            this.f76669f.release();
            this.f76669f = null;
            j(2);
        }
        ExtractorMediaSource extractorMediaSource = this.f76668e;
        if (extractorMediaSource != null) {
            extractorMediaSource.releaseSource(null);
            this.f76668e = null;
        }
    }

    @Override // Fa.b
    public void a() {
        b();
        l();
    }

    @Override // Fa.b
    public void b() {
        if (B()) {
            this.f76669f.setPlayWhenReady(false);
        }
    }

    @Override // Fa.b
    public void c() {
        Log.d(f76664k, "togglePlayerController: " + this.f76672i);
        if (this.f76672i) {
            this.f76670g.hideController();
            j(11);
        } else {
            this.f76670g.showController();
            j(10);
        }
    }

    @Override // Fa.b
    public void d() {
        if (B()) {
            this.f76669f.setPlayWhenReady(true);
        }
    }

    @Override // Fa.b
    public void e(long j10, long j11, long j12) {
        m(j10, j11, j12);
    }

    @Override // Fa.b
    public void f(long j10) {
        if (B()) {
            this.f76669f.seekTo(j10);
        }
        d();
        k(j10);
    }

    @Override // Fa.b
    public void g() {
        if (this.f76672i) {
            return;
        }
        this.f76670g.showController();
        j(10);
    }

    @Override // Fa.b
    public long getCurrentPosition() {
        if (B()) {
            return this.f76669f.getCurrentPosition();
        }
        return 0L;
    }

    @Override // Fa.b
    public long getDuration() {
        if (B()) {
            return this.f76669f.getDuration();
        }
        return 0L;
    }

    @Override // Fa.b
    public void h() {
        if (this.f76672i) {
            this.f76670g.hideController();
            j(11);
        }
    }

    @Override // Da.d
    public void n() {
        b();
    }

    public void w(SimpleExoPlayerView simpleExoPlayerView) {
        this.f76670g = simpleExoPlayerView;
        if (this.f76671h == null) {
            int iC = this.f76667d == 2 ? r.c(simpleExoPlayerView.getContext()) : r.e(simpleExoPlayerView.getContext());
            Ea.a aVar = new Ea.a(this);
            aVar.f33343c = iC;
            this.f76671h = aVar;
        }
        simpleExoPlayerView.setOnTouchListener(this.f76671h);
        simpleExoPlayerView.setControllerVisibilityListener(new PlayerControlView.VisibilityListener() { // from class: Wa.b
            @Override // com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener
            public final void onVisibilityChange(int i10) {
                this.f76663a.C(i10);
            }
        });
        simpleExoPlayerView.setKeepScreenOn(true);
        simpleExoPlayerView.setPlayer(this.f76669f);
        simpleExoPlayerView.showController();
    }

    public ExchangeFile y() {
        return this.f76666c;
    }

    public String z() {
        return this.f76666c.getName();
    }

    public class a implements Player.EventListener {
        public a() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onLoadingChanged(boolean z10) {
            Log.d(c.f76664k, "onLoadingChanged: " + c.this.f76669f.getBufferedPosition());
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            Log.d(c.f76664k, "onPlaybackParametersChanged");
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            Log.d(c.f76664k, "onPlayerError");
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z10, int i10) {
            Log.d(c.f76664k, "onPlayerStateChanged: playWhenReady = " + String.valueOf(z10) + " playbackState = " + i10);
            if (i10 == 1) {
                Log.d(c.f76664k, "STATE_IDLE");
                return;
            }
            if (i10 == 2) {
                Log.d(c.f76664k, "STATE_BUFFERING");
                return;
            }
            if (i10 == 3) {
                Log.d(c.f76664k, "STATE_READY");
                return;
            }
            if (i10 != 4) {
                C5596a.a("UNKNOWN STATE:", i10, c.f76664k);
                return;
            }
            c cVar = c.this;
            cVar.f76669f.prepare(cVar.f76668e);
            c.this.b();
            Log.d(c.f76664k, "STATE_ENDED");
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i10) {
            Log.d(c.f76664k, "onRepeatModeChanged");
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, Object obj, int i10) {
            Log.d(c.f76664k, "onTimelineChanged: timeline=" + timeline);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            Log.d(c.f76664k, "TrackGroupArray");
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i10) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onSeekProcessed() {
        }
    }
}
