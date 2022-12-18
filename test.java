SimpleExoPlayer exoPlayer = new SimpleExoPlayer.Builder(context).build();

MediaSource audioSource = new ExtractorMediaSource.Factory(dataSourceFactory)
                .createMediaSource(audioUri);

exoPlayer.prepare(audioSource);
