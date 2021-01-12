import praw

title = "Yubi yubi!"
url = 'https://static.zerochan.net/Inugami.Korone.full.2982792.jpg'
index = 0;

while True:
    reddit = praw.Reddit(client_id = '****',
                         client_secret='****',
                         user_agent=str(index),
                         username='****',
                         password='****')
    reddit.validate_on_submit = True
    try:
        subreddit = reddit.subreddit('c4dgaming')
        subreddit.submit(title, url=url)
        index += 1
        print(index)
    except praw.exceptions.APIException as e:
        print(e.message)
