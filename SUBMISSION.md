# Submission

Fill this in as you go. It must be complete when you push tag `final` at 13:10.

## Candidate

- Name: Mounika Padala
- Room:

## How to run

```bash
./mvnw verify
```

<!-- Add the exact commands for anything else: how to run your concurrency tests on their own, how to produce the report. -->

## Assumptions

<!-- Every assumption you made where the brief was silent, and why. -->

Input:

A)Check if farmerid is already booked within 10 min from the reservation table if no record found, go and create a new as follows below
1)farmer booking  read the following parameters-> input id, district, landholding, depotid, product, season
2) get the scheme where in the scheme falls in opens and close time based on the season
3)Calculate the total required by farmer from multiply the acres and the product unit it is available at depot_id farmer opted for
	a) check if sku is having more amount than the farmer is requested for
	b) if not iterate and go to next Sku and recalc
4) Update the required fields in reservation by getting the calcluated fileds and generating unique id for each reservation

B) If farmerId already exist and farmer updating booking within 10 min and recalculate the total and update the depotstock at SKUs and the reservation table for farmerId

C) If the event containing farmer pickup is not coming within 10 min or time exceeds, mark the reservation status as "CANCELLED"

-

## Domain model

<!-- Your entities, how each is identified, the state each holds, and the reservation lifecycle. A short list is enough. -->

-

## Concurrency cases

| Case | Rule at risk | Test that covers it | Status |
| --- | --- | --- | --- |
|  |  |  |  |

Cases I knowingly left out, and why:

-

## Caching

<!-- Where caching would help, where it must not be used, and what you built (if anything). -->

-

## District report

- Code path:
- How to run it:
- Matches `data/seed/expected_report.csv`: yes / no / partly

## Additional requirement (released at 12:40)

<!-- Your approach and which files changed. -->

-

## Done and not done

| Item | Status | Notes |
| --- | --- | --- |
| M1: core service, concurrency tests green |  |  |
| Additional requirement |  |  |
| M2: district report |  |  |
| M3: stretch (which) |  |  |

## What I would do next

-
