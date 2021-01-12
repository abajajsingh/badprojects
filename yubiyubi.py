import praw

reddit = praw.Reddit(client_id = 'DkLr0rfzwv47Wg',
                     client_secret='NeDl34tBs3UX44EyAVrHFsTaDl0_4Q',
                     user_agent='<console:yubi-bot:0.0.2>',
                     username='****',
                     password='****')
reddit.validate_on_submit = True

title = "Yubi yubi!"
url = 'https://static.zerochan.net/Inugami.Korone.full.2982792.jpg'
index = 0;

while True:
    reddit = praw.Reddit(client_id = 'DkLr0rfzwv47Wg',
                         client_secret='NeDl34tBs3UX44EyAVrHFsTaDl0_4Q',
                         user_agent=str(index),
                         username='yubi-bot',
                         password='90dogyears')
    reddit.validate_on_submit = True
    try:
        subreddit = reddit.subreddit('c4dgaming')
        subreddit.submit(title, url=url)
        index += 1
        print(index)
    except praw.exceptions.APIException as e:
        print(e.message)
