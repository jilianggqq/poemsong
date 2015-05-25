package com.gqq.tangpoem;

/**
 * Created by gqq on 2015/5/24.
 */
public class Backup {
    // tvContent

//						String contentDetails = "content details";
//						String contentBrief = "ddd";
//						String shareUrl = "www.baidu.com";
//						Intent intent = new Intent(Intent.ACTION_SEND);
//						intent.setType("text/plain");
//						// intent.setPackage("com.tencent.mm");
//						// intent.setPackage("com.sina.weibo");
//						// intent.putExtra(Intent.EXTRA_SUBJECT, "分享");
//						// intent.putExtra(Intent.EXTRA_TEXT, "你好 ");
//						// intent.putExtra(Intent.EXTRA_TITLE, "我是标题");
//						// intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//						// startActivity(Intent.createChooser(intent, "请选择"));
//
//						List<ResolveInfo> resInfo = getPackageManager().queryIntentActivities(intent, 0);
//						if (!resInfo.isEmpty()) {
//							List<Intent> targetedShareIntents = new ArrayList<Intent>();
//							for (ResolveInfo info : resInfo) {
//								Intent targeted = new Intent(Intent.ACTION_SEND);
//								targeted.setType("text/plain");
//								ActivityInfo activityInfo = info.activityInfo;
//								Log.d("package", String.format("packageName:%s,name:%s", activityInfo.packageName,
//										activityInfo.name));
//
//								// judgments : activityInfo.packageName,
//								// activityInfo.name, etc.
//								if (activityInfo.packageName.contains("bluetooth")
//										|| activityInfo.packageName.contains("android.mms")
//										|| activityInfo.packageName.contains("sec.android.app.FileShareClient")
//										|| activityInfo.packageName.contains("bluecrane.calendar")
//										|| activityInfo.packageName.contains("alibaba.mobileim")
//										|| activityInfo.packageName.contains("renren.mobile.android")
//										|| activityInfo.packageName.contains("com.skype.rove")
//										|| activityInfo.packageName.contains("om.evernote")
//										|| activityInfo.packageName.contains("om.evernote")
//										|| activityInfo.packageName.contains("tencent.qqpimsecure")
//										|| activityInfo.packageName.contains("tencent.mm")
//										|| activityInfo.packageName.contains("tencent.mobile")
//										|| activityInfo.packageName.contains("baidu.netdisk")
//
//								) {
//									continue;
//								}
//
//								targeted.putExtra(Intent.EXTRA_TITLE, tvTitle.getText().toString());
//								String poem_contentString = tvContent.getText().toString();
//								String content = poem_contentString.length() > 110 ? poem_contentString.substring(0,
//										110) : poem_contentString;
//								content = String.format("%s...来自诗词精选，下载网址：%s", content, APK_URL);
//								targeted.putExtra(Intent.EXTRA_TEXT, content);
//								targeted.setPackage(activityInfo.packageName);
//								targetedShareIntents.add(targeted);
//							}
//
//							Intent chooserIntent = Intent.createChooser(targetedShareIntents.remove(0),
//									"Select app to share");
//							if (chooserIntent == null) {
//								return;
//							}
//
//							// A Parcelable[] of Intent or LabeledIntent objects
//							// as set with
//							// putExtra(String, Parcelable[]) of additional
//							// activities to place
//							// a the front of the list of choices, when shown to
//							// the user with a
//							// ACTION_CHOOSER.
//							chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,
//									targetedShareIntents.toArray(new Parcelable[] {}));
//
//							try {
//								startActivity(chooserIntent);
//							} catch (android.content.ActivityNotFoundException ex) {
//								Toast.makeText(MainActivity.this, "Can't find share component to share",
//										Toast.LENGTH_SHORT).show();
//							}
//						}
}
