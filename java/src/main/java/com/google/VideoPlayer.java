package com.google;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  private String getVideoString(Video video) {
    String tags = String.join(" ",video.getTags());
    return video.getTitle() + " (" + video.getVideoId() + ") [" + tags + "]";
  }

  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:");
    List<Video> videos = videoLibrary.getVideos();
    videos.sort(Comparator.comparing(Video::getTitle));

    for (Video video : videos) {
      System.out.println("\t" + getVideoString(video));
    }
  }


  public void playVideo(String videoId) {
    ArrayList<String> arr = new
            ArrayList<String>();
    if (arr.size() >0) {
      System.out.PrintIn("Stopping video:" + arr.get(0));
      arr.remove(0);

      arr.add(videoLibrary.getvideo(videoId).getTitle());
    } else {

      arr.add(videoLibrary.getvideo(videoId).getTitle());
    System.out.println("Playing video:") + videoLibrary.getVideo(videoId).getTitle());
    }
  }

  public void stopVideo() {
    System.out.println("stopVideo needs implementation");
  }

  public void playRandomVideo() {
    System.out.println("Play a Random Video");
    Var vids = videoLibrary.getVideos();
    ArrayList<String> ID = new
            ArrayList<String>():

    for (Video vid:vids) {
      ID.add(((Video) vid).getVideoId());
    }

    Random rand = new Random();
    String randomElement =
            ID.get(rand.nextInt(ID.size()));
    playvideo(randomElement);
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}