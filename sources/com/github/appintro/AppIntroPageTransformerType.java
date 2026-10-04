package com.github.appintro;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppIntroPageTransformerType {

    public static final class Depth extends AppIntroPageTransformerType {

        @NotNull
        public static final Depth INSTANCE = new Depth();

        private Depth() {
            super(null);
        }
    }

    public static final class Fade extends AppIntroPageTransformerType {

        @NotNull
        public static final Fade INSTANCE = new Fade();

        private Fade() {
            super(null);
        }
    }

    public static final class Flow extends AppIntroPageTransformerType {

        @NotNull
        public static final Flow INSTANCE = new Flow();

        private Flow() {
            super(null);
        }
    }

    public static final class Parallax extends AppIntroPageTransformerType {
        private final double descriptionParallaxFactor;
        private final double imageParallaxFactor;
        private final double titleParallaxFactor;

        public Parallax() {
            this(0.0d, 0.0d, 0.0d, 7, null);
        }

        public final double getDescriptionParallaxFactor() {
            return this.descriptionParallaxFactor;
        }

        public final double getImageParallaxFactor() {
            return this.imageParallaxFactor;
        }

        public final double getTitleParallaxFactor() {
            return this.titleParallaxFactor;
        }

        public /* synthetic */ Parallax(double d10, double d11, double d12, int i10, C4969v c4969v) {
            this((i10 & 1) != 0 ? 1.0d : d10, (i10 & 2) != 0 ? -1.0d : d11, (i10 & 4) != 0 ? 2.0d : d12);
        }

        public Parallax(double d10, double d11, double d12) {
            super(null);
            this.titleParallaxFactor = d10;
            this.imageParallaxFactor = d11;
            this.descriptionParallaxFactor = d12;
        }
    }

    public static final class SlideOver extends AppIntroPageTransformerType {

        @NotNull
        public static final SlideOver INSTANCE = new SlideOver();

        private SlideOver() {
            super(null);
        }
    }

    public static final class Zoom extends AppIntroPageTransformerType {

        @NotNull
        public static final Zoom INSTANCE = new Zoom();

        private Zoom() {
            super(null);
        }
    }

    public /* synthetic */ AppIntroPageTransformerType(C4969v c4969v) {
        this();
    }

    private AppIntroPageTransformerType() {
    }
}
