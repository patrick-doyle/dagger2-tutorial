
package com.twistedeqations.dagger2tutorial.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

public class GithubRepo {

  @SerializedName("id")
  @Expose
  public long id;
  @SerializedName("name")
  @Expose
  public String name;
  @SerializedName("full_name")
  @Expose
  public String fullName;
  @SerializedName("owner")
  @Expose
  public GithubRepoOwner owner;
  @SerializedName("private")
  @Expose
  public boolean _private;
  @SerializedName("html_url")
  @Expose
  public String htmlUrl;
  @SerializedName("description")
  @Expose
  public String description;
  @SerializedName("fork")
  @Expose
  public boolean fork;
  @SerializedName("url")
  @Expose
  public String url;
  @SerializedName("forks_url")
  @Expose
  public String forksUrl;
  @SerializedName("keys_url")
  @Expose
  public String keysUrl;
  @SerializedName("collaborators_url")
  @Expose
  public String collaboratorsUrl;
  @SerializedName("teams_url")
  @Expose
  public String teamsUrl;
  @SerializedName("hooks_url")
  @Expose
  public String hooksUrl;
  @SerializedName("issue_events_url")
  @Expose
  public String issueEventsUrl;
  @SerializedName("events_url")
  @Expose
  public String eventsUrl;
  @SerializedName("assignees_url")
  @Expose
  public String assigneesUrl;
  @SerializedName("branches_url")
  @Expose
  public String branchesUrl;
  @SerializedName("tags_url")
  @Expose
  public String tagsUrl;
  @SerializedName("blobs_url")
  @Expose
  public String blobsUrl;
  @SerializedName("git_tags_url")
  @Expose
  public String gitTagsUrl;
  @SerializedName("git_refs_url")
  @Expose
  public String gitRefsUrl;
  @SerializedName("trees_url")
  @Expose
  public String treesUrl;
  @SerializedName("statuses_url")
  @Expose
  public String statusesUrl;
  @SerializedName("languages_url")
  @Expose
  public String languagesUrl;
  @SerializedName("stargazers_url")
  @Expose
  public String stargazersUrl;
  @SerializedName("contributors_url")
  @Expose
  public String contributorsUrl;
  @SerializedName("subscribers_url")
  @Expose
  public String subscribersUrl;
  @SerializedName("subscription_url")
  @Expose
  public String subscriptionUrl;
  @SerializedName("commits_url")
  @Expose
  public String commitsUrl;
  @SerializedName("git_commits_url")
  @Expose
  public String gitCommitsUrl;
  @SerializedName("comments_url")
  @Expose
  public String commentsUrl;
  @SerializedName("issue_comment_url")
  @Expose
  public String issueCommentUrl;
  @SerializedName("contents_url")
  @Expose
  public String contentsUrl;
  @SerializedName("compare_url")
  @Expose
  public String compareUrl;
  @SerializedName("merges_url")
  @Expose
  public String mergesUrl;
  @SerializedName("archive_url")
  @Expose
  public String archiveUrl;
  @SerializedName("downloads_url")
  @Expose
  public String downloadsUrl;
  @SerializedName("issues_url")
  @Expose
  public String issuesUrl;
  @SerializedName("pulls_url")
  @Expose
  public String pullsUrl;
  @SerializedName("milestones_url")
  @Expose
  public String milestonesUrl;
  @SerializedName("notifications_url")
  @Expose
  public String notificationsUrl;
  @SerializedName("labels_url")
  @Expose
  public String labelsUrl;
  @SerializedName("releases_url")
  @Expose
  public String releasesUrl;
  @SerializedName("deployments_url")
  @Expose
  public String deploymentsUrl;
  @SerializedName("created_at")
  @Expose
  public DateTime createdAt;
  @SerializedName("updated_at")
  @Expose
  public DateTime updatedAt;
  @SerializedName("pushed_at")
  @Expose
  public DateTime pushedAt;
  @SerializedName("git_url")
  @Expose
  public String gitUrl;
  @SerializedName("ssh_url")
  @Expose
  public String sshUrl;
  @SerializedName("clone_url")
  @Expose
  public String cloneUrl;
  @SerializedName("svn_url")
  @Expose
  public String svnUrl;
  @SerializedName("homepage")
  @Expose
  public Object homepage;
  @SerializedName("size")
  @Expose
  public long size;
  @SerializedName("stargazers_count")
  @Expose
  public long stargazersCount;
  @SerializedName("watchers_count")
  @Expose
  public long watchersCount;
  @SerializedName("language")
  @Expose
  public String language;
  @SerializedName("has_issues")
  @Expose
  public boolean hasIssues;
  @SerializedName("has_downloads")
  @Expose
  public boolean hasDownloads;
  @SerializedName("has_wiki")
  @Expose
  public boolean hasWiki;
  @SerializedName("has_pages")
  @Expose
  public boolean hasPages;
  @SerializedName("forks_count")
  @Expose
  public long forksCount;
  @SerializedName("mirror_url")
  @Expose
  public String mirrorUrl;
  @SerializedName("open_issues_count")
  @Expose
  public long openIssuesCount;
  @SerializedName("forks")
  @Expose
  public long forks;
  @SerializedName("open_issues")
  @Expose
  public long openIssues;
  @SerializedName("watchers")
  @Expose
  public long watchers;
  @SerializedName("default_branch")
  @Expose
  public String defaultBranch;
  @SerializedName("network_count")
  @Expose
  public long networkCount;
  @SerializedName("subscribers_count")
  @Expose
  public long subscribersCount;

}
