SimpleExoPlayer exoPlayer = new SimpleExoPlayer.Builder(context).build();

MediaSource audioSource = new ExtractorMediaSource.Factory(dataSourceFactory)
                .createMediaSource(audioUri);

exoPlayer.prepare(audioSource);


exoPlayer.setBackgroundedOnSuspend(true);


exoPlayer.setPlayWhenReady(true);


exoPlayer.setPlayWhenReady(false);


exoPlayer.release();
