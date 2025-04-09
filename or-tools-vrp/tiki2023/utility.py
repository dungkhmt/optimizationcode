def hhmmss_to_second(s: str) -> int:
    hour, minute, second = map(int, s.split(':'))
    return 3600 * hour + 60 * minute + second


def second_to_hhmmss(second: int | float) -> str:
    hour = int(second / 3600)
    second %= 3600
    minute = int(second / 60)
    second %= 60

    return f"{hour:02}:{minute:02}:{second:02}"


if __name__ == '__main__':
    print(second_to_hhmmss(hhmmss_to_second('7:49:59')))
