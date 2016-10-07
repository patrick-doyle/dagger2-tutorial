
package com.twistedeqations.dagger2tutorial.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GithubUser {

  @SerializedName("login")
  @Expose
  public String login;
  @SerializedName("id")
  @Expose
  public long id;
  @SerializedName("avatar_url")
  @Expose
  public String avatarUrl;
  @SerializedName("gravatar_id")
  @Expose
  public String gravatarId;
  @SerializedName("url")
  @Expose
  public String url;
  @SerializedName("html_url")
  @Expose
  public String htmlUrl;
  @SerializedName("followers_url")
  @Expose
  public String followersUrl;
  @SerializedName("following_url")
  @Expose
  public String followingUrl;
  @SerializedName("gists_url")
  @Expose
  public String gistsUrl;
  @SerializedName("starred_url")
  @Expose
  public String starredUrl;
  @SerializedName("subscriptions_url")
  @Expose
  public String subscriptionsUrl;
  @SerializedName("organizations_url")
  @Expose
  public String organizationsUrl;
  @SerializedName("repos_url")
  @Expose
  public String reposUrl;
  @SerializedName("events_url")
  @Expose
  public String eventsUrl;
  @SerializedName("received_events_url")
  @Expose
  public String receivedEventsUrl;
  @SerializedName("type")
  @Expose
  public String type;
  @SerializedName("site_admin")
  @Expose
  public boolean siteAdmin;
  @SerializedName("name")
  @Expose
  public String name;
  @SerializedName("company")
  @Expose
  public Object company;
  @SerializedName("blog")
  @Expose
  public String blog;
  @SerializedName("location")
  @Expose
  public String location;
  @SerializedName("email")
  @Expose
  public Object email;
  @SerializedName("hireable")
  @Expose
  public boolean hireable;
  @SerializedName("bio")
  @Expose
  public String bio;
  @SerializedName("public_repos")
  @Expose
  public long publicRepos;
  @SerializedName("public_gists")
  @Expose
  public long publicGists;
  @SerializedName("followers")
  @Expose
  public long followers;
  @SerializedName("following")
  @Expose
  public long following;
  @SerializedName("created_at")
  @Expose
  public String createdAt;
  @SerializedName("updated_at")
  @Expose
  public String updatedAt;


}
